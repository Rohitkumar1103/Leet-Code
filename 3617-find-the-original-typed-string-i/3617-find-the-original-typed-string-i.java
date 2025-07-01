class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int total = 1;  // original string is always valid

        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int len = j - i;
            if (len > 1) {
                total += (len - 1);  // you can remove 1 to (len-1) chars from this group
            }
            i = j;
        }

        return total;
    }
}
