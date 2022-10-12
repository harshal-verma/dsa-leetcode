class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }
        for(Integer x : map.keySet()){
            int val = map.get(x);
            if(val > nums.length / 2) return x;
        }
        return -1;
    }
}