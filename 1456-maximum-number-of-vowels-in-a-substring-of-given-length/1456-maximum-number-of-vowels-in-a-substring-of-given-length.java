class Solution {
    public int maxVowels(String s, int k) {
       int left = 0;
       int right =0  ;
       int  window=0;
       int res=0;

       for(;right < k ;right ++){
           window += isVol(s.charAt(right));
       }
       res = window;

       while( right < s.length()){
        window -= isVol(s.charAt(left));
        left++;
        window +=  isVol(s.charAt(right));
        right++;
       res = Math.max( res ,window);
       }
           return res ;
    }
       private int isVol(char c){
        return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') ? 1 : 0 ; 
       
    }
}