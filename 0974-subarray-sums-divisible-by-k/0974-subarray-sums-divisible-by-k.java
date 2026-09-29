import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      HashMap<Integer , Integer > map = new HashMap<>();
   
      map.put(0 , 1);
      int prefixsum = 0;
      int count = 0;
      for (int x : nums){
          
          prefixsum += x;
           
           int reminder = prefixsum % k;
           if(reminder < 0 ){
            reminder += k ;
           }
           if(map.containsKey(reminder)){
            count +=  map.get(reminder);
           }
           map.put(reminder , map.getOrDefault( reminder, 0) + 1 );
     }
      return count  ;
    }
}