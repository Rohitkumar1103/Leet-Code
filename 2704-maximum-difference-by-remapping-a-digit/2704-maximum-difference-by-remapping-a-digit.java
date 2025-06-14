class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char[] maxChars = s.toCharArray();
        char toReplaceMax = ' ';
        for (char c : maxChars) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = s;
        if (toReplaceMax != ' ') {
            maxStr = s.replace(toReplaceMax, '9');
        }
        char[] minChars = s.toCharArray();
        char toReplaceMin = ' ';
        for (char c : minChars) {
            if (c != '0') {
                toReplaceMin = c;
                break;
            }
        }
        String minStr = s;
        if (toReplaceMin != ' ') {
            minStr = s.replace(toReplaceMin, '0');
        }
        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}