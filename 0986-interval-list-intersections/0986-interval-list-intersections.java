class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int []> result  = new ArrayList<>();
  
        int i = 0;
        int j = 0 ;

        while( i < firstList.length && j < secondList.length ){
            int start1 = firstList[i][0];
            int end1 = firstList [i][1];
            int start2 = secondList [j] [0];
            int end2 = secondList [j ][1];

            if(start1 <= start2){
                if(end1 >= start2){
                int s = Math.max(start1 ,start2);
                int e = Math.min( end1 ,end2 );
                result.add(new int[]{s,e});
                }
            }
            else{
                if(start2 <= start1){
                    if(end2 >= start1){
                        int s =Math.max(start1 ,start2);
                        int e =Math.min(end1 ,end2);
                        result.add( new int []{s,e});
                    }
                }
            }
            if( end1 <= end2 ){
                i++;
            }else{
                j++;
            }
        }
        return result.toArray(new int[result.size()][]); // convert list in array int[][]..
    }
}