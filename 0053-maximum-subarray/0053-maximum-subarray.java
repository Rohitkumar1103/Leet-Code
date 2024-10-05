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
        int maxSum = nums[0];  
        int currentSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
