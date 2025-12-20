
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
        }
}
class ll{
    Node head=null;
    Node prev=null;
    void inst(int d){
        Node nn=new Node(d);
        if(head==null){
            head=nn;
            prev=nn;
        }
        else{
            prev.next=nn;
            prev=nn;
        }
    }
    void dis(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    }
public class intro {
    public static void main(String[] args){
        int[] arr={1,2,3};
        ll a=new ll();
        for(int d:arr){
            a.inst(d);
        }
        a.dis();
    }
}
