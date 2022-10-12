class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int x = 0, y = m[0].length - 1;
        while(x < m.length && y >= 0){
            if(m[x][y] == t) return true;
            else if(m[x][y] > t) y--;
            else x++;
        }
        return false;
    }
}