class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;    

        //CHECK IF FIRST ROW HAS ANY ZERO
        for(int j=0; j<n; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }    
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}






//BRUTE FORCE APPROACH
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int marker = (int) -1e9;

//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == 0){
//                     for(int col = 0; col<matrix[0].length; col++){
//                         if(matrix[i][col] != 0) matrix[i][col] = marker;
//                     }
//                     for(int row = 0; row<matrix.length; row++){
//                         if(matrix[row][j] != 0) matrix[row][j] = marker;
//                     }
//                 }
//             }
//         }
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == marker) matrix[i][j] = 0;
//             }
//         }
//     }
// }