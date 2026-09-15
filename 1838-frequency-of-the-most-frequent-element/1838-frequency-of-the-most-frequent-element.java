class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

       int left =0 ;
      long sum = 0;
        int res =0 ;
        for (int  right =0 ;right < nums.length; right++){
                sum += nums[right];
            
            while((long)(right-left+1) * nums[right] > sum + k ){
                 sum -= nums[left];
                 left++ ;
            }
            res = Math.max(res ,right - left +1);           
        }  
       return res ;
   }
}