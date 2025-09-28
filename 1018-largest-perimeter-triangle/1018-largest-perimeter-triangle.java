class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int perimeter= 0;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i] + nums[i+1] > nums[i+2]){
                perimeter = nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return perimeter;
    }
}