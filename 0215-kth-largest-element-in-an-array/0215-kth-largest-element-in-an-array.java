class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        
        // Step 2: Find the k-th largest element
        return nums[nums.length - k];
    }
}