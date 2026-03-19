import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().trim().split("\\s+");

        Queue<Node> q = new LinkedList<>();
        Node root = null;

        if (!arr[0].equalsIgnoreCase("null")) {
            root = new Node(Integer.parseInt(arr[0]));
            q.add(root);
        } else {
            return;
        }

        for (int i = 1; i < arr.length; i += 2) {
            Node cur = q.poll();
            if (cur == null) continue;

            String l = arr[i];
            if (!l.equalsIgnoreCase("null")) {
                Node ln = new Node(Integer.parseInt(l));
                cur.left = ln;
                q.add(ln);
            }

            if (i + 1 < arr.length) {
                String r = arr[i + 1];
                if (!r.equalsIgnoreCase("null")) {
                    Node rn = new Node(Integer.parseInt(r));
                    cur.right = rn;
                    q.add(rn);
                }
            }
        }

        Queue<Node> lv = new LinkedList<>();
        lv.add(root);

        while (!lv.isEmpty()) {
            int sz = lv.size();

            System.out.print(lv.peek().data + " ");

            for (int i = 0; i < sz; i++) {
                Node n = lv.poll();

                if (n.left != null) lv.add(n.left);
                if (n.right != null) lv.add(n.right);
            }
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
    }
}
