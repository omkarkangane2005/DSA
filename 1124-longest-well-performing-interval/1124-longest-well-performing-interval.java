class Solution {
    public int longestWPI(int[] hours) {
     HashMap < Integer ,Integer >map = new HashMap<>();

     int prefix  = 0 ;
     int ans = 0 ;

      for ( int i = 0 ; i < hours.length ; i++){
          
          if(hours[i] > 8){
            prefix++;
          }else{
            prefix--;
          }
         if(prefix > 0){
            ans = i + 1 ;
         }else{
            if(map.containsKey(prefix - 1)){
                ans = Math.max(ans , i - map.get(prefix -1));
            }
         }
         if(!map.containsKey(prefix)){
            map.put(prefix , i);
         }
      }  
      return ans ;
    }
}