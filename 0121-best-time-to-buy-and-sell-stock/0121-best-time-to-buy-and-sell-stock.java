class Solution {
    public int maxProfit(int[] prices) {
        // int ans = 0; O(N^2) solution
        // for(int i = 0; i < prices.length; i++){
        //     for(int j = i + 1 ; j < prices.length ; j++){
        //         if(Math.abs(prices[i] - prices[j]) > ans && prices[j] > prices[i]){
        //             ans = Math.abs(prices[i] - prices[j]);
        //         }
        //     }
        // }
        // return ans;
        int ans = 0, min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++){
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}