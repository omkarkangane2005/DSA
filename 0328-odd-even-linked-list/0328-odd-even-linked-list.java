class Solution {
    public ListNode oddEvenList(ListNode head){
        
     if(head == null || head.next == null){
        return head ;
     }
     ListNode odd =head ;
     ListNode even = head.next ;
     ListNode evenhead = even ;
     while(even != null && even.next !=null){
        
        odd.next =even.next;
        odd = even.next;

        even.next= odd.next ;
        even = odd.next ;

     }
     odd.next = evenhead;
       return head ;
    }
}