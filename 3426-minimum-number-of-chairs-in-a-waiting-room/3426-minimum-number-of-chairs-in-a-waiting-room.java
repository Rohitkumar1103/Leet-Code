class Solution {
    public int minimumChairs(String s) {
        int count = 0, minChair = 0; //count tracks the current number of people in the room. |||  minChair track the maximum number of people in the room at any point, which corresponds to the minimum number of chairs needed.
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
            } else{
                count--;
            }
            //After each step, update ans to be the maximum value between count and ans. This ensures that ans always reflects the maximum number of people that have been in the room at any given point.
            minChair = Math.max(count, minChair);
        }
        return minChair;
    }
}