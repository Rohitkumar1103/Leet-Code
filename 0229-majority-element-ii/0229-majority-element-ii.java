class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int greaterThan = nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num) > greaterThan){
                list.add(num);
            }
        }
        return list;
    }
}