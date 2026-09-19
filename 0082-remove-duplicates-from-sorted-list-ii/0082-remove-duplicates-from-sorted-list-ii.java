
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy ;
     dummy.next = head ;
         
         while (prev.next != null){
             ListNode current = prev.next ;

            if(  current.next != null && current.val == current.next.val ){
               
            
            while(current.next != null && current.val == current.next.val){
                current = current.next ;
            }
            prev.next =current.next ;

            }else{
                prev = prev.next;    
            }
            
         }
         return dummy.next ;
    }
}