
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null){
            return head ;
        }
        ListNode slow = head ;  
        ListNode fast = head.next;

      while (fast != null && fast.next != null) {
        slow = slow.next ;
        fast = fast.next.next ;
    }
        ListNode second = slow.next ;
         slow.next = null;

         //sort
         ListNode left = sortList(head);
         ListNode right = sortList(second);

         //merge sorted-halves
         return merge(left ,right);
    }

         private ListNode merge(ListNode left ,ListNode right){
            ListNode dummy = new ListNode(0);
            ListNode current = dummy ;

            while(left != null && right != null){
                if(left.val <= right.val){
                    current.next = left;
                    left = left.next ;
                }else{
                    current.next =right;
                    right =right.next;
                }
                current = current.next ;
            }
            //attach reamaining nodes 
            if(left != null){
                current.next = left ;
            }
            if(right != null ){
                current.next = right ;
            }
            return dummy.next ;
         
    }
}