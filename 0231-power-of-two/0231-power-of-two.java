// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         return n > 0 && (n & (n - 1)) == 0;
//     }
// }





class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0||n<=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}