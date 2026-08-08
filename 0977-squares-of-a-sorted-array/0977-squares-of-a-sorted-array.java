class Solution {
    public int[] sortedSquares(int[] nums) {

       int n = nums.length ;
       int []ans = new int[n];

       int left = 0 ;
       int right = n - 1 ;
       int index = n - 1;
       
       while(left <= right){
        int leftSqaure =nums[left]*nums[left];
        int rightSqaure =nums[right]*nums[right];

        if(leftSqaure > rightSqaure){
            ans[index]= leftSqaure;
            left++;
        }else{
            ans[index]= rightSqaure;
            right--;

        }
        index --;
       }
       return ans ;
    }
}