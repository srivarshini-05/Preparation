/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node rev(Node j){
        Node curr=j;
        Node nextn=null;
        Node prev=null;
        while(curr!=null){
           nextn= curr.next;
           curr.next=prev;
           prev=curr;
           curr=nextn;
        }
        return prev;
    }
    
    public Node addOne(Node head) {
        // code here.
        Node h=rev(head);
        Node t=h;
        while(t!=null ){
            if(t.data<9){
                t.data=t.data+1;
                return rev(h);
            }
            else{
                t.data=0;
                t=t.next;
            }
            
            
        }
        Node nn=new Node(1);
        h=rev(h);
        nn.next=h;
        return nn;
        
    }
}
