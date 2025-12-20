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

/////////////////////////////////////////////////////////////////////////////////

//my approch
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
    public ListNode rev(ListNode s,ListNode e,int left,int right){
        ListNode curr=s;
        ListNode prev=null;
        //ListNode nextn=null;
        for(int i=0;i<right-left+1;i++){
            ListNode nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        //ListNode l=nextn;
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)return head;
        ListNode s=head;
        int l=1;
        while(s!=null){
            if(left==l)break;
            s=s.next;
            l++;
        }
        ListNode so=head;
        int l1=1;
        while(so!=null){
            if(left-1==l1)break;
            so=so.next;
            l1++;
        }
        int r=1;
        ListNode e=head;
        while(e!=null){
            if(right==r)break;
            e=e.next;
            r++;
        }
        int r1=1;
        ListNode en=head;
        while(en!=null){
            if(right+1==r1)break;
            en=en.next;
            r1++;
        }
        //s.next=e.next;
        ListNode prev=rev(s,e,left,right);
        if(so!=null){
            so.next=prev;
        }
        else{
            head=prev;
        }
    
        //so.next=e;
        s.next=en;
        return head;
        
    }
}
