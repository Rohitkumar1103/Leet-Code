class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int mid = n - k-1;

        reverse(nums, 0, mid);
        reverse(nums, mid+1, n-1);
        reverse(nums, 0, n-1);
    }
    private void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}