class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =new ArrayList<>();

        HashMap <Character , Integer > map1= new HashMap<>();
        HashMap <Character , Integer > map2= new HashMap<>();

        // count char of p 
        for(char ch : p.toCharArray()){
            map1.put(ch , map1.getOrDefault(ch , 0) +1);
        }
            int low = 0 ;
            int high = 0 ;
            int windowsize =p.length();

            while(high < s.length()){

                //add character to window
                char ch = s.charAt(high);
                map2.put(ch , map2.getOrDefault(ch , 0) + 1);

                // if window becomes bigger, remove left character
                if(high -low +1 > windowsize){
                    char left = s.charAt(low);
                    map2.put(left , map2.get(left) -1);

                    if(map2.get(left) == 0){
                        map2.remove(left);
                    }
                    low++;
                }//compare frequencies 
                if(map1.equals(map2)){
                    result.add(low);
                }
                high++;
            }
            return result ;
    }
}