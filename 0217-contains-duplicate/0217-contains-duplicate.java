import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {

       HashSet<Integer >set = new HashSet<>();
       
        
       for(int x : nums){
         
          if(set.contains(x)){  // here set are empty first time {}
            return true ;
          }
          set.add(x); // now this add nums[0] means = x then next this will useful to check set.contians(x) ;
          
         
       } 
       return false ;
    }
}