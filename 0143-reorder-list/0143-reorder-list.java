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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode ln = head;
        ListNode ln1 = head;

        while (ln1 != null && ln1.next != null){
            ln = ln.next;
            ln1 = ln1.next.next;
        }
        ListNode ln3 = ln.next;
        ln.next = null;
        ListNode ln4 = null;
        while (ln3 != null) {
            ListNode next = ln3.next;
            ln3.next = ln4;
            ln4 = ln3;
            ln3 = next;
        }
        ln3 = ln4;
        ListNode ln5 = head;
        while (ln3 != null){
            ListNode first = ln5.next;
            ListNode second = ln3.next;
            ln5.next = ln3;
            ln3.next = first; 
            ln5 = first;
            ln3 = second;
        } 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna