class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String doubled = goal + goal;

        return doubled.contains(s);
    }
}