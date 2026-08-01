class Solution {
         // Returns the total hours needed if Koko eats at 'speed' bananas/hour
    public long  speedofkoko(int []piles ,long  speed){

        long  hours = 0 ;
        for( int pile : piles){
            hours = hours + pile/speed ;
            
            if( pile % speed != 0){
                hours++ ;
            }
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int  low = 1 ;
        int  high = 0;

        // find maximum pile 
        for(int pile : piles){
            high = Math.max(high , pile );
        }

        int  ans = high ;

        while(low <= high){
           
           int  mid = low+(high -low )/2 ;

           long  hours = speedofkoko(piles  ,mid);

           if( hours <= h){
            ans = Math.min(ans,mid) ;
            high = mid-1  ;
           }else{
            low = mid+1 ;
           }
        }
        return ans ;
    }
}