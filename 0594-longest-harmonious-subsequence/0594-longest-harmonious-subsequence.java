class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) +1);
        }
        int maxLength = 0;
        for(int key : hm.keySet()){
            if(hm.containsKey(key+1)){
                maxLength = Math.max(maxLength, hm.get(key) + hm.get(key+1));
            }
        }
        return maxLength;
    }
}