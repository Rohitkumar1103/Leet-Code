class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int nowOne = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                nowOne++;
            } else {
                maxOne = Math.max(maxOne, nowOne);
                nowOne = 0;
            }
        }
        return Math.max(maxOne, nowOne);
    }
}