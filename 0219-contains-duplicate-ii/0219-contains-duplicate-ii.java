// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<nums.length; i++){
//             if(map.containsKey(nums[i])){
//                 int value = map.get(nums[i]);
//                 if(i-value <= k){
//                     return true;
//                 }
//             }
//             map.put(nums[i], i);
//         }
//         return false;
//     }
// }


class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!window.add(nums[i])) {
                return true; // duplicate found in window
            }
            if (window.size() > k) {
                window.remove(nums[i - k]); // keep window size <= k
            }
        }
        return false;
    }
}
