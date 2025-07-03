class Solution {
    public char kthCharacter(int k) {
        char currentChar = 'a';
        int currentLength = 1;

        while(currentLength < k){
            currentLength *= 2;
        }

        while(currentLength > 1){
            int halfLength = currentLength/2;
            if(k <= halfLength){
                currentLength = halfLength;
            } else{
                k -= halfLength;
                currentChar = (char)(currentChar + 1);     
                currentLength = halfLength;
            }
        }
        return currentChar;
    }
}