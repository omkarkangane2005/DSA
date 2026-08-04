class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //You must write a solution in O(log(m * n)) time complexity.
        
        // for this reason we sort the matrix in "1D" array and then mid target 
       
        int rows =matrix.length ;
        int cols = matrix[0].length;

        // for(int i = 0; i < rows ; i ++){
        //     if( target < matrix[i][0] || target > matrix[i][cols-1]){
        //         continue;
        //     }

            int low =0 ;
            int high = rows*cols -1 ;

            while( low  <= high ){

                int mid = low+(high -low)/2;

                int val = matrix[mid / cols] [mid % cols] ;

                    if(val == target){   // i = row & mid = col ;
                        return true ;
                    } else if (val < target ){
                        low = mid +1 ;
                    }else {
                        high = mid -1 ;
                    }
            }
        
        return false ;
    }
}