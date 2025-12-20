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
    public ListNode ex(ListNode head,int c1){
        ListNode ta=head;
        int co=0;
        while(ta!=null){
            co++;
            if(co==c1){
                break;
            }
            ta=ta.next;
        }
        return ta;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || k==0)return head;
        int c=1;
        ListNode temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        if(k%c==0){
            return head;
        }
        k=k%c;
        int c1=c-k;
        temp.next=head;
        ListNode e=ex(head,c1);
        head=e.next;
        e.next=null;
        return head;
    }
}
