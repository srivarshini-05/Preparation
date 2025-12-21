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

    // get kth node from current position
    public ListNode revhead(ListNode curr, int k) {
        int count = 1;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        return curr;
    }

    // reverse a linked list
    public ListNode rev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevGroupTail = null;

        while (temp != null) {

            ListNode kth = revhead(temp, k);
            if (kth == null) {   // less than k nodes left
                if (prevGroupTail != null) {
                    prevGroupTail.next = temp;
                }
                break;
            }

            ListNode nextGroupHead = kth.next;
            kth.next = null;

            // reverse current group
            ListNode newHead = rev(temp);

            if (temp == head) {
                head = newHead;
            } else {
                prevGroupTail.next = newHead;
            }

            prevGroupTail = temp; // temp becomes tail after reverse
            temp = nextGroupHead;
        }

        return head;
    }
}
