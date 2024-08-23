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
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum = currsum + nums[i];
            maxsum = Math.max(maxsum,currsum);
            if(currsum<=0){
                currsum=0;
            }
        }
        return maxsum;
    }
}