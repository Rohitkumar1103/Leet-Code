class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            if(num > max){
                max = num;
            }
        }
        boolean allNegative = true;
        for (int num : set) {
            if (num >= 0) {
                allNegative = false;
                break;
            }
        }
        if(allNegative) return 1;

        for(int i=1; i<max; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}