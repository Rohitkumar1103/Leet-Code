class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!charIndexS.containsKey(s.charAt(i))){
                charIndexS.put(s.charAt(i), i);
            }
            if(!charIndexT.containsKey(t.charAt(i))){
                charIndexT.put(t.charAt(i), i);
            }
            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}