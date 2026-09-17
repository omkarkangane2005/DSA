
class Solution {
    public boolean isPalindrome(ListNode head) {
        
       ListNode slow = head ;
       ListNode fast = head ;

       while(fast != null && fast.next != null){
             slow =slow.next ;
             fast = fast.next.next;
       } 
         ListNode secondhalf = slow ;
         ListNode prev = null ;
         ListNode curr = secondhalf ;

         while( curr != null){
           ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
         }
         ListNode p1 = head ;
         ListNode p2 = prev ;
         while(p2 != null ){
            if(p1.val != p2.val){
                return false ;
            }
            p1=p1.next;
            p2=p2.next;
         }
         return true ;
    }
}