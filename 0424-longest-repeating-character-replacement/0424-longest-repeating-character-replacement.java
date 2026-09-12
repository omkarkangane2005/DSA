class Solution {
    public int characterReplacement(String s, int k) {
        
       int freq [] = new int[26];
       int left =0 ;
       int maxfreq = 0 ;
       int maxlength = 0 ;

       for(int right = 0 ; right < s.length() ; right ++){
        // add current character 
        int index = s.charAt(right) -'A';
        freq[index]++;
        //update highest frequency 
        maxfreq=Math.max(maxfreq , freq[index]);

        // shrink of too many replacement are needed

        while((right-left+1) - maxfreq > k){
            int leftIndex =s.charAt(left)-'A';
            freq[leftIndex]--;
            left++ ;
        }
        //update maximum length 
        maxlength = Math.max(maxlength , right - left +1);
       }
       return maxlength;
    }
}