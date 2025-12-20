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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode d=new ListNode(-1);
        d.next=head;
        ListNode prev1=d;
        ListNode curr=head;
        for(int i=0;i<left-1;i++){
            prev1=prev1.next;
            curr=curr.next;
        }
        ListNode prev=null;
        ListNode hl=curr;
        for(int j=0;j<right-left+1;j++){
            ListNode nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        hl.next=curr;
        prev1.next=prev;
        return d.next;
        
    }
}
