class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        char[] merged = new char[n+m];  
        int i = 0 ,j = 0,k = 0;

        while(i<n && j<m){
            merged[k++] = word1.charAt(i++);
            merged[k++] = word2.charAt(j++);
        }

        while(i<n){
            merged[k++] = word1.charAt(i++);
        }
        while(j<m){
            merged[k++] = word2.charAt(j++);
        }
        return new String(merged);
    }
}


// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder sb = new StringBuilder();
//         int i = 0, j = 0;

//         while(i < word1.length() && j < word2.length()){
//             sb.append(word1.charAt(i));
//             sb.append(word2.charAt(j));
//             i++; j++;
//         }
//         if(i<word1.length()) sb.append(word1.substring(i));
//         if(j<word2.length()) sb.append(word2.substring(j));

//         return sb.toString();
//     }
// }