class Solution {
    public int[] runningSum(int[] nums) {
        // TC O(N) and SC O(N)
        // int[] pre = new int[nums.length];
        // pre[0] = nums[0];
        // for(int i = 1 ; i < nums.length ; i++){
        //     pre[i] = pre[i-1] + nums[i];
        // }
        // return pre;
        
        // TC O(N) and SC O(1)
        int i = 1;
        while(i < nums.length){
            nums[i] += nums[i-1];
            i++;
        }
        return nums;
    }
}