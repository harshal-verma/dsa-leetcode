class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] ans = new int[2];
        while(i != nums.length){
            int corrIdx = nums[i] - 1;
            if(nums[corrIdx] != nums[i]){
                int temp = nums[corrIdx];
                nums[corrIdx] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx] != idx + 1){
               ans[0] = nums[idx];
                ans[1] = idx + 1;
            }
        }
        return ans;
    }
}