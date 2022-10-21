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
        
        //merge sort
        //return mergeSort(nums, 0 , n-1);
        
        // quickSort(nums, 0, n-1);
        
        //count sort
        int min = nums[0], max = nums[0];
        for(int i = 0 ; i < n ; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i], max);
        }
        
        int[] freq = new int[max - min + 1];
        
        for(int i = 0 ; i < nums.length ; i++){
            int idx = nums[i] - min;
            freq[idx]++;
        }
        
        for(int i = 1 ; i < freq.length ; i++){
            freq[i] = freq[i] + freq[i-1];  
        }
        
        int[] ans = new int[nums.length];
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            int val =  nums[i];
            int pos = freq[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            freq[val - min]--;
        }
        
        return ans;
    }
    
    public void quickSort(int[] nums, int lo, int hi){
        if(lo >= hi) return;
        int pivot = nums[hi];
        int pi = partition(nums, pivot, lo, hi);
        quickSort(nums, lo, pi-1);
        quickSort(nums, pi+1, hi);
    }
    
    public int partition(int[] nums, int pivot, int lo, int hi){
        int i = lo, j = lo;
        while(i <= hi){
            if(nums[i] <= pivot){
                swap(nums, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j - 1;
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
