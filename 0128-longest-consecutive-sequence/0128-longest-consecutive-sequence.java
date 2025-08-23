// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int num :  nums){
//             set.add(num);
//         }
//         int maxLength = 0;
//         for(int num : set){
//             if(!set.contains(num-1)){
//                 int currentNum = num;
//                 int length = 1;
//                 while (set.contains(currentNum + 1)) {
//                     currentNum++;
//                     length++;
//                 }
//                 maxLength = Math.max(maxLength, length);
//             }
//         }
//     return maxLength;
//     }
// }

//ABOVE CODE RUNS WITH O(n) COMPLEXITY
//BELOW CODE RUNS WITH O(nLOGn) COMPLEXITY 

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int count = 1, maxLen = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] == nums[i] + 1) {
                count++;
                maxLen = Math.max(maxLen, count);
            } else if (nums[i+1] != nums[i]) {
                count = 1;
            }
        }
        return maxLen;
    }
}
