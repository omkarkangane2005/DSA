class Solution {
    public void sortColors(int[] nums) {

    int low =0 ;
    int high = nums.length-1;
    int mid = 0 ;

    while(mid<=high){

        if(nums[mid] == 0){
         int temp1 = nums[low];
         nums[low] = nums[mid];
         nums[mid]=temp1;
         low++;
         mid++;
        }
        else if( nums[mid] ==2){
            int temp2 = nums[high];
            nums[high] = nums[mid];
            nums[mid]= temp2;
            high--;
            
        }
        else{
            mid++;
        }

       }    
    }
}