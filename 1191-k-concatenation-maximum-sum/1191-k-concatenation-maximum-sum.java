class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
      long totalsum = 0;
    //total sum of array 
    for(int x :arr){
        totalsum += x;
    } 

    // kadane + maximumprefix + maximumsufix 
    long curr = 0 ;
    long maxSubarray = 0;

    long prefix =0;
    long maxPrefix =0;

    long sufix = 0;
    long maxSufix = 0;

    //for prefix 
    for(int x: arr){
        prefix += x;
        maxPrefix =Math.max(prefix , maxPrefix );
    }    
    //for sufix 
    for(int i = arr.length-1 ; i >=0 ;i--){
        sufix += arr[i] ;
        maxSufix = Math.max(sufix ,maxSufix ) ;
    }
    //kadane normal sum
    for(int x : arr){
        curr = Math.max(0 ,curr+x);
        maxSubarray = Math.max(curr ,maxSubarray);
    }
    long ans ;

    if(k == 1 ){
       ans = maxSubarray;
    }
    else if(totalsum > 0 ){
        ans =  Math.max( maxSubarray , maxSufix + maxPrefix + (k-2) *totalsum);
    }else{
      ans = Math.max( maxSubarray , maxPrefix + maxSufix ) ;
    }
    return (int)(ans % 1000000007) ;  
    }
}