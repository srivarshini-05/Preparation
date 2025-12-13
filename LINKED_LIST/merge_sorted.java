import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class ll {
    Node head = null, prev = null;

    void ins(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            prev = nn;
        } else {
            prev.next = nn;
            prev = nn;
        }
    }

    void dis(Node h) {
        Node t = h;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    // 🔥 Merge function
    Node merge(Node h1, Node h2) {
        if (h1 == null) return h2;
        if (h2 == null) return h1;

        Node headMerged = null, tail = null;

        while (h1 != null && h2 != null) {
            Node temp;
            if (h1.data <= h2.data) {
                temp = h1;
                h1 = h1.next;
            } else {
                temp = h2;
                h2 = h2.next;
            }

            if (headMerged == null) {
                headMerged = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        if (h1 != null) tail.next = h1;
        if (h2 != null) tail.next = h2;

        return headMerged;
    }
}

public class Main {
    public static void main(String[] args) {
        ll list1 = new ll();
        ll list2 = new ll();

        // Example sorted inputs
        list1.ins(1);
        list1.ins(3);
        list1.ins(5);

        list2.ins(2);
        list2.ins(4);
        list2.ins(6);

        ll helper = new ll();

        Node mergedHead = helper.merge(list1.head, list2.head);

        helper.dis(mergedHead);
    }
}
