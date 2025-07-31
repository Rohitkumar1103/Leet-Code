class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int i=0, j=1;
        while(j+1< nums.length){
            if((nums[i] < nums[j] && nums[j+1]< nums[j]) 
            || nums[i] > nums[j] && nums[j+1] > nums[j]){
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }
}