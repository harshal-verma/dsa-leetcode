class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        //bubble sort
        //in every step we are comparing adjacent elements
        //in every pass largest element will come in the end
        // best case O(N) and worst case O(N^2) 
        //sc O(1) inplace sorting algorithm
        //stable sorting algorithm  
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0  ; j < n - i - 1 ; j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        
        //selection sort
        //select an element and put it at its correct index
        //best case -> O(N^2) worst case -> O(N^2)
        // for(int i = 0 ; i < n ; i++){
        //     int last = n - i - 1;
        //     int maxIndex = getIndex(nums, 0 , last);
        //     swap(nums, maxIndex, last);
        // }
        
        //insertion sort
        //used for small values of n and works well with array is partially sorted array
        //best case O(N) worst case O(N^2)
        // for(int i = 0 ; i < n - 1 ; i++){
        //     for(int j = i + 1 ; j > 0 ; j--){
        //         if(nums[j] < nums[j-1]){
        //             swap(nums, j-1 , j);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
    public int getIndex(int[] num, int s, int e){
        int maxInd = s;
        for(int i = s ; i <= e ; i++){
            if(num[i] > num[maxInd]){
                maxInd = i;
            }
        }
        return maxInd;
    }
    
    public void swap(int[] num, int i ,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
