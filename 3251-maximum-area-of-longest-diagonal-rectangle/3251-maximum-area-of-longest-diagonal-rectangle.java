class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = Integer.MIN_VALUE;
        int maxArea = 0;

        for(int[] rect : dimensions){
            int l = rect[0], w = rect[1];

            double diagonal = Math.sqrt(l*l + w*w);
            int area = l*w;

            if(diagonal > maxDiagonal ||
            (diagonal == maxDiagonal && area > maxArea)){
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        return maxArea;
    }
}