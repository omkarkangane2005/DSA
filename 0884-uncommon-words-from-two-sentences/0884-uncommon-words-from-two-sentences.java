import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

       HashMap<String , Integer> map = new HashMap<>();
       List<String> result = new ArrayList<>();
       
      String[] word1 = s1.split(" ");
       for( int i =0 ; i< word1.length ; i++){
        map.put(word1[i], map.getOrDefault( word1[i] ,0)+1);
       }
       String[] word2 = s2.split(" ");
       for(int j =0 ; j < word2.length; j++){
        map.put(word2[j] , map.getOrDefault(word2[j] , 0) +1);
       }

       for (String word: map.keySet()){
        if (map.get(word) == 1) {
            result.add(word);
        }
       }
         return result.toArray(new String[0]);
    }
}