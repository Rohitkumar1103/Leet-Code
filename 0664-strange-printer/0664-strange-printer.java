class Solution {
    public int strangePrinter(String s) {
        int n =s.length();
        char[] sChar = s.toCharArray();
        int[][] dp = new int[n][n];
        for(int [] in : dp){
            Arrays.fill(in, -1);
        }
        return Util(0, n-1, sChar, dp);
    }
    public int Util(int i, int j, char[] sChar, int[][] dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int firstLetter = sChar[i];
        int answer = 1+Util(i+1, j, sChar, dp);
        for(int k=i+1; k <=j; k++){
            if(sChar[k] == firstLetter){
                int betterAnswer = Util(i, k-1, sChar, dp) + Util(k+1, j, sChar, dp);
                answer = Math.min(answer, betterAnswer);
            }
        }
        return dp[i][j] = answer;
    }
}