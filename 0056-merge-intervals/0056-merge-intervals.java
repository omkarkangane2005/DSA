import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals){

        //array interval adi sort karyche 
        Arrays.sort(intervals , (a,b) -> Integer.compare( a[0] , b[0]));

        List<int[]>result = new ArrayList<>();

    int start1 = intervals[0][0];
    int end1 = intervals [0][1];
    
    for(int i =1 ; i < intervals.length ; i++){

        int start2 = intervals [i][0];
        int end2 = intervals [i][1];

        if( start2 <= end1){
            start1 =start1;
            end1 = Math.max(end1 , end2);
        }else {
        result.add(new int [] {start1,end1} ) ;
        // start interval 
        start1 =start2;
        end1 =end2;
        }
        }   
     //add last interval 
      result.add(new int[] {start1 ,end1});
    // convert list into [][]
    return result.toArray(new int[result.size()][]) ;
    }
}