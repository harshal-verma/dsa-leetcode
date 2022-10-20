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
        return mergeSort(nums, 0 , n-1);
    }
    
    public int[] mergeSort(int[] num, int lo, int hi){
        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = num[lo];
            return ba;
        }
        int mid = lo + (hi - lo) / 2;
        int[] fsh = mergeSort(num, lo, mid);
        int[] ssh = mergeSort(num, mid + 1 , hi);
        int[] fsa = merge(fsh, ssh);
        return fsa;
    }
    
    public int[] merge(int[] a, int[] b){
        int[] ans = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                ans[k++] = a[i++];
            }else{
                ans[k++] = b[j++];
            }
        }
        while(i < a.length){
                ans[k++] = a[i++];
        }
        while(j < b.length){
                ans[k++] = b[j++];
        }
        return ans;
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
