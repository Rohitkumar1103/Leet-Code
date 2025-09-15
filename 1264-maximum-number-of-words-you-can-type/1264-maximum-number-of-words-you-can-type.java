class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> broken = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            broken.add(ch);
        }

        String[] words = text.split(" ");
        int count = 0;

        for(String word : words){
            boolean canType = true;
            for(char ch : word.toCharArray()){
                if(broken.contains(ch)){
                    canType = false;
                    break;
                }
            }
            if(canType) count++;
        }
        return count;
    }
}


// class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
//         int count = 0;
//         String[] words = text.split(" ");

//         for(String word : words){
//             boolean canType = true;
//             for(char ch : brokenLetters.toCharArray()){
//                 if(word.indexOf(ch) != -1){
//                     canType = false;
//                     break;
//                 }
//             }
//             if(canType) count++;
//         }
//         return count;
//     }
// }