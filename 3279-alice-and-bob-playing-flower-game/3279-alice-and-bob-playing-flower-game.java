class Solution {
    public long flowerGame(int n, int m) {
        long oddN = (n+1)/2;
        long evenN = n/2;
        long oddM = (m+1)/2;
        long evenM = m/2;

        return (oddN * evenM) + (evenN * oddM);
    }
}


// class Solution {
//     public long flowerGame(int n, int m) {
//         // sum should be odd for alice to win
//         // iske simply O(1) walla multiplications se bhi kar sakta..
//         long ans = 0L;
//         for(int i = 1;i <=n;i++){            
//             if(i%2 == 1)
//                 ans += m/2;                 
//             else
//                 ans += m - m/2;
//         }
//         return ans;
//     }
// }