class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes){
        
        int count = 0 ;
        int maxextra = 0;
        int currextra =0;

        for(int i=0 ; i<customers.length ;i++){
            
            if(grumpy[i]==0)
              count += customers[i];

            else currextra += customers[i];

            if( i>= minutes && grumpy[i - minutes] == 1)
                  currextra = currextra - customers[i - minutes];
            
            if(currextra > maxextra)
                 maxextra = currextra ;
        }
        return count + maxextra;
    }
}