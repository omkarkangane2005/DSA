import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap <>();

        int low =0 ;
        int maxlength = 0 ;

        for ( int high = 0 ;high < fruits.length ;high++){

            map.put(fruits[high] , map.getOrDefault(fruits[high] , 0) + 1); 

           while(map.size() > 2){ 
            map.put(fruits[low], map.get(fruits[low]) -1);

            if( map.get(fruits[low])== 0){
               map.remove(fruits[low]);
            }
            low ++ ;
           }   
           maxlength =Math.max( maxlength , high-low+1 );
        } 

     return maxlength ;
    }
}