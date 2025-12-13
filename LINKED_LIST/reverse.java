void reverse(){
    Node nextn=null;
    Node curr=head;
    Node prev=null;
    while(curr!=null){
      nextn=curr.next;
      curr.next=prev;
      prev=curr;
      curr=nextn;
    }
    head=prev;
    System.out.println(prev.data);
  }
