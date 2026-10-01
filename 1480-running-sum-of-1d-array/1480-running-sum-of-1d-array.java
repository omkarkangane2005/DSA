class Solution {
    public int[] runningSum(int[] nums) {
        
        int prefixsum = 0 ;
        int arr[] = new int [nums.length];

        for(int i =0 ; i < nums.length ; i ++){

            int prev = prefixsum + nums[i];  
            prefixsum = prev ;
           arr[i]= prefixsum;
        }
        return arr ; 
    }
}