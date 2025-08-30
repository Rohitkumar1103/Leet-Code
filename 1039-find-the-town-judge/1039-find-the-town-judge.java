class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int[] count = new int[n+1];

        for(int[] edge: trust){
            count[edge[1]]++;
            count[edge[0]]--;
        }
        for(int i=0; i<n+1; i++){
            if(count[i] == n-1) return i;
        } 
        return -1;
    }
}