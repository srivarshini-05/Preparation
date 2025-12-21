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
 class Pair {
    int val1;        // integer priority
    ListNode node;  // linked list node

    Pair(int val1, ListNode node) {
        this.val1 = val1;
        this.node = node;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.val1 - b.val1);
        for(int i=0;i<lists.length;i++){
            if (lists[i] != null){
            pq.offer(new Pair(lists[i].val,lists[i]));}
        }
        ListNode d=new ListNode(-1);
        ListNode temp=d;
        while(!pq.isEmpty()){
            Pair p=pq.peek();
            ListNode v=p.node;
            temp.next=v;
            if(v.next!=null){
                pq.offer(new Pair(v.next.val,v.next));
            }
            temp=temp.next;
            pq.poll();
        }
        return d.next;
    }
}
