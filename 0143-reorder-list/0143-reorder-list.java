import java.util.*;

class Solution {
    public void reorderList(ListNode head) {
        
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        // ListNode secondHalf = slow ;
        // ListNode prev = null;
        // ListNode curr = secondHalf ;

        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next ;

             curr.next =prev ;
             prev =curr ;
             curr =next ;
        }
        ListNode p1 = head ;
        ListNode p2 = prev ;

        while( p2 != null){
           ListNode firstNext = p1.next;
           ListNode secondNext = p2.next ;

           p1.next = p2 ;
           p2.next = firstNext ;

           p1 = firstNext;
           p2 = secondNext ;
        }
    }
}