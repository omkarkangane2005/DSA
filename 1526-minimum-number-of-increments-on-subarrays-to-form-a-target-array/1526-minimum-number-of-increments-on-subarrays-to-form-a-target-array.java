class Solution {
    public int minNumberOperations(int[] target) {
        
        int n =target.length;
        int sum = target[0];

        for(int i = 0 ; i < n-1 ; i ++ ){
            if(target[i+1] > target[i]){

                sum = sum + target[i+1] - target[i] ;
            }
        }
        return sum ;
    }
}