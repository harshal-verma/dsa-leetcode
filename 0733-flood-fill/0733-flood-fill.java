class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int[][] ans = image;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        dfs(sr, sc, ans, image, color, delRow, delCol, iniColor);
        return ans;
    }
    public void dfs(int r, int c,int[][] ans, int[][] image, int color, int[] delRow, int[] delCol, int iniColor){
        ans[r][c] = color;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0 ; i < 4 ; i++){
            int nrow = r + delRow[i];
            int ncol = c + delCol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != color){
                dfs(nrow, ncol, ans, image, color, delRow, delCol, iniColor);
            }
        }
    }
}