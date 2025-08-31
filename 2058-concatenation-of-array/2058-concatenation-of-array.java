class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doubled = new int[2*nums.length];

        for(int i=0; i<nums.length; i++){
            doubled[i] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            doubled[nums.length+i] = nums[i];
        }
        return doubled;
    }
}