class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int coeffMod10 = binomMod10(n - 1, i);
            result = (result + coeffMod10 * nums[i]) % 10;
        }

        return result;
    }

    // Compute binomial coefficient modulo 10 via CRT
    private int binomMod10(int n, int k) {
        int mod2 = binomLucas(n, k, 2);
        int mod5 = binomLucas(n, k, 5);

        // Solve using CRT (x ≡ mod2 (mod 2), x ≡ mod5 (mod 5))
        for (int x = 0; x < 10; x++) {
            if (x % 2 == mod2 && x % 5 == mod5) {
                return x;
            }
        }
        return 0; // should not reach here
    }

    // Compute nCk mod prime using Lucas theorem
    private int binomLucas(int n, int k, int p) {
        if (k < 0 || k > n) return 0;
        int res = 1;
        while (n > 0 || k > 0) {
            int ni = n % p;
            int ki = k % p;
            if (ki > ni) return 0;
            res = (res * nCrSmall(ni, ki, p)) % p;
            n /= p;
            k /= p;
        }
        return res;
    }

    // Small nCr mod prime (brute force, since p=2 or 5 is tiny)
    private int nCrSmall(int n, int r, int p) {
        if (r < 0 || r > n) return 0;
        if (r == 0 || r == n) return 1;
        int num = 1, den = 1;
        for (int i = 0; i < r; i++) {
            num = (num * (n - i)) % p;
            den = (den * (i + 1)) % p;
        }
        // Fermat’s little theorem since p is prime
        return (num * modPow(den, p - 2, p)) % p;
    }

    private int modPow(int base, int exp, int mod) {
        int res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}
