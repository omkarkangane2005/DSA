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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to make result list creation easier
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        // Continue until both lists are finished and no carry remains
        while (l1 != null || l2 != null || carry != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }

            int sum = digit1 + digit2 + carry;

            // Store carry for next addition
            carry = sum / 10;

            // Current digit of answer
            current.next = new ListNode(sum % 10);

            // Move result pointer
            current = current.next;
        }

        return dummy.next;
    }
}