class Solution {
    public boolean backspaceCompare(String s, String t) {
        
      int i = s.length()-1;
      int j = t.length()-1;
      
      while( i >=0 || j >= 0){
         // find next valid character is in - i & j
        i = getNextValidIndex(s , i);
        j = getNextValidIndex(t , j);
          
          // when both str in finish
        if(i < 0 && j < 0){
           return true ;
        }
          // if one str is remainig
        if(i < 0 || j < 0){
            return false ;
        }
        if(s.charAt(i) != t.charAt(j)){
            return false ;
        }
        i--;
        j--;
      }
      return true ;
    }
      
      private int getNextValidIndex(String str , int index){

        int skip = 0 ;

        while(index >= 0 ){
           
           if(str.charAt(index) == '#'){
              skip++;
           }
           else if(skip > 0){
                skip--;
           }else{
            break ;
           }
           index--;
        }
        return index ;
       
    }
      
  
    
}