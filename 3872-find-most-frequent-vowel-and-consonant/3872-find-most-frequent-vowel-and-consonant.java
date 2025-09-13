class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxVow = 0, maxCons = 0;
        // String vowels = "aeiou"
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u'){
                maxVow = Math.max(maxVow, freq);
            } else{
                maxCons = Math.max(freq, maxCons);
            }
        }
        return maxVow + maxCons;
    }
}