class Solution {
    public int minDifficulty(int[] jd, int d) {
        if(d > jd.length) return -1;
        int[][] dp = new int[d + 1][jd.length];
        for(int[] p : dp) Arrays.fill(p, -1);
        return dfs(jd, d, dp, 0);
    }
    public int dfs(int[] jd, int d, int[][] dp, int idx){
        if(d == 1){
            int max = 0;
            while(idx < jd.length) max = Math.max(max, jd[idx++]);
            return max;
        }
        if(dp[d][idx] != -1){
            return dp[d][idx];
        }
        int max = 0;
        int res = Integer.MAX_VALUE;
        for(int i = idx ; i < jd.length - d + 1 ; i++){
            max = Math.max(max, jd[i]);
            res = Math.min(res, max + dfs(jd, d - 1, dp, i+1));
        }
        return dp[d][idx] = res;
    }
}