import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

       List<int[] >result  = new ArrayList<>();

       boolean inserted = false ;

       //insert new interval 

       for (int [] interval : intervals ){

            if( inserted ==  false &&  newInterval[0] < interval[0]){
            result.add(newInterval);
             inserted = true ;
           }
           result.add(interval);
        }
        if(inserted == false){
            result.add(newInterval);
        }
        // merge intervals 

        List<int[]> newresult = new ArrayList<>();

        int start1 = result.get(0) [0];
        int end1 = result.get(0) [1] ;

        for(int i= 1 ; i < result.size() ; i++){
         int start2 = result.get (i) [0];
         int end2 = result.get (i) [1];

         if( end1 >= start2 ){
            end1 = Math.max(end1 ,end2);
         }else{
            newresult.add ( new int []{ start1 ,end1});
            start1 = start2 ;
            end1 = end2 ;
         }
        }
        newresult.add(new int [] { start1 ,end1});
        return newresult.toArray( new int[newresult.size()] []) ;
    }

}