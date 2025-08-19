class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            } else{
                count += (nums[i] == candidate) ? 1 : -1;
            }
        }
        return candidate;
    }
}