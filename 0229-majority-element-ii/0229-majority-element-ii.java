class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> a = new ArrayList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num : nums){
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       for(int num : nums){
           if(map.get(num) != null && map.get(num) > (nums.length / 3)){
               a.add(num);
               map.remove(num);
           }
       }
       return a;
    }
}