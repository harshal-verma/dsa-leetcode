class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, i = 0;
        while(i < n){
            int corrIdx = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < n && nums[i] != nums[corrIdx]){
                swap(nums, i , corrIdx);
            }else{
                i++;
            }
        }
        for(int idx = 0 ; idx < nums.length ; idx++){
           if(idx + 1 != nums[idx]){
               return idx + 1;
           }
        }
       return n + 1;
    }
    public void swap(int[] nums, int i, int corrIdx){
        int temp = nums[i];
        nums[i] = nums[corrIdx];
        nums[corrIdx] = temp;
    }
}