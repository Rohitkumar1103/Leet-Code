class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        System.arraycopy(nums, 0, result, 0, n);
        System.arraycopy(nums, 0, result, n, n);

        return result;
    }
}




// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int[] doubled = new int[2*nums.length];

//         for(int i=0; i<nums.length; i++){
//             doubled[i] = nums[i];
//         }
//         for(int i=0; i<nums.length; i++){
//             doubled[nums.length+i] = nums[i];
//         }
//         return doubled;
//     }
// }