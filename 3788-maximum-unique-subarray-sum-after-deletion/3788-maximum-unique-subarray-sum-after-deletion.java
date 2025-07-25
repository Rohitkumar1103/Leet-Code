class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int a:nums){
            if(!set.contains(a) && a>=0){
                sum+=a;
                set.add(a);
            }else{
                ans++;
                max=Math.max(max,a);
            }
        }
        return ans==nums.length?max:sum;
    }
}