/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            Node nn=temp.next;
            if(temp.random!=null){
                nn.random=temp.random.next;}
            else{
                nn.random=null;
            }
            temp=temp.next.next;
        }
        Node d=new Node(-1);
        Node res=d;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            res=res.next;
        }
        return d.next;
        
    }
}
