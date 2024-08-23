// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;
//             for (int j = i; j < nums.length; j++) {
//                 sum = sum + nums[j];
//                 if (sum > max) {
//                     max = sum;
//                 }
//             }
//         }
//         return max;
//     }
// }
//All Test Cases are not passed

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int largest=nums[0];
        for (int ele:nums){
            sum+=ele;
            largest=sum>largest ? sum : largest;
            if(sum<0)sum=0;
        }
        return largest;
    }
}