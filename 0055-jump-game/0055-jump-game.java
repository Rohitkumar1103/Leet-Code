class Solution {
    public boolean canJump(int[] nums) {
        int maxGo =0;
        for(int i=0; i<nums.length; i++){
            if(i > maxGo){
                return false;
            }
            maxGo = Math.max(maxGo, i + nums[i]);
        }
        return true;
    }
}