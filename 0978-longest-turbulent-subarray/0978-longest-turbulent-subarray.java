class Solution {
    public int maxTurbulenceSize(int[] arr) {

       int maxlength =1 ;
        int left = 0 ;
       int prev =0;
        for (int right = 1 ; right < arr.length ; right++){
            int curr = 0 ;

            if(arr[right] > arr[right -1]){
                curr =1 ;
            }else if (arr[right] < arr[right-1]){
                curr =-1;
            }
            if(curr == 0){
                left = right ;
            }else if(curr == prev ){
                left = right -1 ;
            }
            maxlength = Math.max(maxlength , right-left+1);

            prev = curr ;
        }
        return maxlength;
    }
}