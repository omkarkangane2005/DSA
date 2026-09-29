class Solution {
    public int largestVariance(String s) {
      
      int ans = 0;

      for(char major = 'a'; major<='z' ; major++){
        for(char minor = 'a' ; minor <= 'z' ; minor++){

            if(major == minor){
                continue;
            }
            int majorCount = 0 ;
            int minorCount = 0;
            int remainingMinor = 0 ;

            for(char c : s.toCharArray()){
                if(c == minor){
                    remainingMinor++;
                }
            }
            for(char c : s.toCharArray()){
                if(c== major){
                    majorCount++;
                }
                if(c == minor ){
                    minorCount++;
                    remainingMinor--;
                }
                if(minorCount > 0){
                    ans = Math.max( ans , majorCount - minorCount);
                }
                if(majorCount < minorCount && remainingMinor > 0){

                    majorCount = 0 ; 
                    minorCount = 0 ;
                }
            }
        }
      }
      return ans ;

    }
}