class Solution {
    public int findClosest(int x, int y, int z) {
        int per1 = Math.abs(x-z);
        int per2 = Math.abs(y-z);

        if(per1 < per2){
            return 1;
        } else if(per1 > per2){
            return 2;
        }
    return 0;
    }
}