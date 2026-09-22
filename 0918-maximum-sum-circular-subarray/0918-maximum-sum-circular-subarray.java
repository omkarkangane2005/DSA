class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxending = nums[0];
        int minending = nums[0];
       
        int Totalsum = nums[0];

        int maxsum =nums[0];
        int minsum = nums[0];
  
        for ( int i =1 ; i < nums.length ; i++){

            Totalsum = (Totalsum+nums[i]);
            
            maxending = Math.max( maxending +nums[i] , nums[i]);
            maxsum = Math.max(maxsum, maxending);

             minending = Math.min( nums[i] , minending + nums[i]);
             minsum = Math.min(minsum ,minending );
           
        }  
              if(maxsum <0){
                return maxsum ;
            }
       int circularsum = Totalsum - minsum ;
       return Math.max(maxsum , circularsum);
    }
}