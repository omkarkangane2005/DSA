class Solution {
    public int shortestSubarray(int[] nums, int k) {
      int n = nums.length ;
      // prfix sum 

      long[] prefix = new long[ n + 1] ;

      for(int i = 0 ; i < n ; i++){
           prefix[i + 1] = prefix[i] + nums[i];
      }
      Deque<Integer> deque = new ArrayDeque<>() ;

      int ans = n + 1 ;
      for(int i = 0 ; i <= n ; i++){
        //check subarray sum >= k 
       while (!deque.isEmpty() &&
                   prefix[i] - prefix[deque.peekFirst()] >= k) {

                ans = Math.min(ans, i - deque.pollFirst());
            }
        //remove useless indices 
        while (!deque.isEmpty() &&
                   prefix[i] <= prefix[deque.peekLast()]) {

                deque.pollLast();
            }
        //add  current prefix  index 
        deque.offerLast(i);
      }
      return ans == n + 1 ? -1 : ans ;
    }
}