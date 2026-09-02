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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        ListNode second = slow.next;
        slow.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(second);
        return merge(l, r);
    }
    public ListNode merge(ListNode l,ListNode r) {
        ListNode ln = new ListNode(0);
        ListNode curr = ln;
        while (l != null && r != null) {
            if (l.val <= r.val) {
                curr.next = l;
                l = l.next;
            } else {
                curr.next = r;
                r = r.next;
            }
            curr = curr.next;
        }
        if (l != null) {
            curr.next = l;
        }
        if (r != null) {
            curr.next = r;
        }
        return ln.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna