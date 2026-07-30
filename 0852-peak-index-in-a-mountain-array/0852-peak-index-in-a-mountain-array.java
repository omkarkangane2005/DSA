class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int low =0 ;
        int high = arr.length -1 ;
        int result = -1 ;
        
        while(low <= high){

        int mid = low+(high -low)/2;

        if( arr[mid] < arr[mid+1]){
            low = mid + 1;
        }else {
            result = mid ;
            high = mid -1 ;
        }
        }
       return result ;
    }
}