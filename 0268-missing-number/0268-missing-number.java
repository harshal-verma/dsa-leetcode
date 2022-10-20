class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, i = 0;
        while(i < n){
            int corrIdx = nums[i];
            if(nums[i] < n && nums[i] != nums[corrIdx]){
                swap(nums, i , corrIdx);
            }else{
                i++;
            }
        }
        for(int idx = 0 ; idx < nums.length ; idx++){
           if(idx != nums[idx]){
               return idx;
           }
        }
       return n;
    }
    public void swap(int[] nums, int i, int corrIdx){
        int temp = nums[i];
        nums[i] = nums[corrIdx];
        nums[corrIdx] = temp;
    }
}