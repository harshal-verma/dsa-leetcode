class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0 , n = nums.length;
        while(i < n){
            int c = nums[i] - 1;
            if(nums[i] != nums[c]) swap(nums, i, c);
            else i++;
        }
        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx] != idx + 1) return nums[idx];
        }
        return -1;
    }
    public void swap(int[] nums, int i, int corrIdx){
        int temp = nums[i];
        nums[i] = nums[corrIdx];
        nums[corrIdx] = temp;
    }
}