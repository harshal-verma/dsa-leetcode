class Solution {
    public void setZeroes(int[][] m) {
        int col0 = 1, rows = m.length, cols = m[0].length;
        for(int i = 0; i < rows; i++){
            if(m[i][0] == 0) col0 = 0;
            for(int j = 1 ; j < cols ; j++){
                if(m[i][j] == 0){
                    m[i][0] = m[0][j] = 0;
                }
            }
        }
        for(int i = rows - 1 ; i >= 0 ; i--){
            for(int j = cols - 1 ; j >= 1 ; j--){
                if(m[i][0] == 0 || m[0][j] == 0){
                    m[i][j] = 0;
                }
            }
            if(col0 == 0) m[i][0] = 0;
        }
    }
}