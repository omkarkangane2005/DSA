class Solution {
    public int numOfSubarrays(int[] arr) {
       
       long ans = 0;
        int even = 1; 
        int odd = 0; 
        int prefix = 0 ;

        for(int x : arr){
            prefix += x ;
            
        if(prefix % 2 == 0 ){
            //if curr even then need to prev odd // increce count even
          ans+=odd;
          even++;
        }else{
            ans += even ;
            odd++ ;
        }
         ans = ans % 1000000007;
        }
    return (int) ans  ;
    }
}