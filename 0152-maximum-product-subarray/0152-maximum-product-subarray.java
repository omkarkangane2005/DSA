class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct = nums[0];
        int minproduct = nums[0];
        int ans = nums[0];

        for(int i =1 ; i< nums.length ; i++){
           
           int newmax = Math.max(Math.max(nums[i] , nums[i]*maxproduct) , nums[i]*minproduct);

           int newmin = Math.min(Math.min(nums[i] , nums[i]*maxproduct) , nums[i] *minproduct);

           maxproduct =newmax;
           minproduct =newmin;

           ans = Math.max(ans ,newmax);

        }
        return ans ;
    }
}