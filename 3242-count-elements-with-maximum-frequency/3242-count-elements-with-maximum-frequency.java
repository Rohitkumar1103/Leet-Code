class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int maxFreq = Integer.MIN_VALUE;
        for(int max : freq.values()){
            maxFreq = Math.max(maxFreq, max);
        }
        int count = 0;
        for(int f : freq.values()){
            if(f == maxFreq){
                count += f;
            }
        }
        return count;
    }
}