class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        grid[0][0] = 1;
        while(!q.isEmpty()){
            int size = q.size();
            int[][] dir = {{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
            while(size-- > 0){
                int[] p = q.poll();
                if(p[0] == n - 1 && p[1] == m - 1) return p[2];
                for(int[] d : dir){
                    int r = p[0] + d[0];
                    int c = p[1] + d[1];
                    if(r >= 0 && c >= 0 && r < n && c < m && grid[r][c] != 1){
                        q.add(new int[]{r, c, p[2] + 1});
                        grid[r][c] = 1;
                    }
                }
            }
        }
        return -1;
    }
}