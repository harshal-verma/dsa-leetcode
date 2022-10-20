class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0, n = nums.length;
        while(i < n){
            int corrIdx = nums[i] - 1;
            if(nums[i] != nums[corrIdx]) swap(nums, i, corrIdx);
            else i++;
        }
        System.out.println(Arrays.toString(nums));
        for(int idx = 0 ; idx < nums.length ; idx++){
            if(idx != nums[idx] - 1) ans.add(idx + 1);
        }
        return ans;
    }
    public void swap(int[] nums, int i, int corrIdx){
        int temp = nums[i];
        nums[i] = nums[corrIdx];
        nums[corrIdx] = temp;
    }
}