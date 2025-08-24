class Solution {
    public void setZeroes(int[][] matrix) {
        int marker = (int) -1e9;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    for(int col = 0; col<matrix[0].length; col++){
                        if(matrix[i][col] != 0) matrix[i][col] = marker;
                    }
                    for(int row = 0; row<matrix.length; row++){
                        if(matrix[row][j] != 0) matrix[row][j] = marker;
                    }
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == marker) matrix[i][j] = 0;
            }
        }
    }
}