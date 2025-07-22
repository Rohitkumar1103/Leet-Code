class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int start = 0, currSum =0, maxSum = 0;

        for(int end=0; end<nums.length; end++){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                currSum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            currSum += nums[end];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}