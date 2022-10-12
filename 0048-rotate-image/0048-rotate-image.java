class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose of the given matrix
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i < j){
                   int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        //rotating all rows
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n / 2 ; j++){
                int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - j - 1];
                    matrix[i][n - j - 1] = temp;
            }
        }
    }
}