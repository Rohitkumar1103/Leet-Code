class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
            if(charSet.contains(c)){
                charSet.remove(c);
                length += 2;
            } else{
                charSet.add(c);
            }
        }

        if(!charSet.isEmpty()){
            length += 1;
        }
        return length;
    }
}