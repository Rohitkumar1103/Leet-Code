class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] splitS1 = s1.split(" ");
        String[] splitS2 = s2.split(" ");
        Set<String> words = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for(String word: splitS1){
            if(words.contains(word)){
                unique.remove(word);
            }else {
                words.add(word);
                unique.add(word);
            }
        } 
        for(String word: splitS2){
            if(words.contains(word)){
                unique.remove(word);
            }else {
                words.add(word);
                unique.add(word);
            }
        }
        String[] res = new String[unique.size()];
        int count = 0;
        for (String word:unique){
            res[count++] = word;
        }
        return res;
    }
}