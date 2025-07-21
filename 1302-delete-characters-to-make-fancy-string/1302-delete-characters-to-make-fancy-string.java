class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int len = result.length();
            if(len >=2){
                char last = result.charAt(result.length()-1);
                char secondLast = result.charAt(result.length()-2);
                if(last == s.charAt(i) && secondLast == s.charAt(i)){
                    continue;
                }
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}