class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode nextn=null;
        ListNode prev=null;
        while(curr!=null){
            nextn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode nn=reverse(s.next);
        ListNode h1=head,h2=nn;
        while(h2!=null){
            if(h1.val!=h2.val){
                reverse(nn);
                return false;
            }
            else{
                h1=h1.next;
                h2=h2.next;
            }
        }
        reverse(nn);
        return true;

    }
}
