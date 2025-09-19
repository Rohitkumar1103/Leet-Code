class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            } else if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        return new int[]{left++, right++};
    }
}


// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<numbers.length; i++){
//             int complement = target - numbers[i];
//             if(map.containsKey(complement)){
//                 return new int[]{map.get(complement)+1, i+1};
//             }
//             map.put(numbers[i], i);
//         }
//         return new int[]{};
//     }
// }