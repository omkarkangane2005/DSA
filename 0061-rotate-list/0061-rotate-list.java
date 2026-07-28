/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null){
            return null ;
        }
        ListNode last = head ;
        int n=1;

        while(last.next != null){
            n++;
            last = last.next;
        }
        k = k%n ;
        if(k==0){
            return head ;
        }
        ListNode t = head ;
        int count =1;

        while( t != null){
            if( count == (n-k)){
                break ;
            }
            count++;
            t =t.next ;
        }
        last.next = head ;
        ListNode result = t.next ;
        t.next = null ;
        return result ;
    }
}