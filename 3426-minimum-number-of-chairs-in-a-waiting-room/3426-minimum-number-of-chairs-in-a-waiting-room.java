class Solution {
    public int minimumChairs(String s) {
        int count = 0, minChair = 0; // count
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
            } else{
                count--;
            }
            minChair = Math.max(count, minChair);
        }
        return minChair;
    }
}