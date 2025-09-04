class Solution {
    public String baseNeg2(int n) {
        if(n == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while(n !=0){
            int remainder = n % -2;
            n = n / -2;

            if(remainder < 0){
                remainder += 2;
                n += 1;
            }
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }
}