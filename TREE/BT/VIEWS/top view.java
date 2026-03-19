import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Node{
            int data;
            Node left;
            Node right;
            Node(int val){
                data=val;
                left=null;
                right=null;
            }
        }
class Pair{
    int hd;
    Node n;
    Pair(Node n1,int hd1){
        hd=hd1;
        n=n1;
        
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        //TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Node> q=new LinkedList<>();
        Node root=null;
        if(!s[0].equals("Null")){
            root=new Node(Integer.parseInt(s[0]));
            q.add(root);
        }
        else{
            return;
        }
        for(int i=1;i<s.length;i+=2){
            Node qp=q.poll();
            String a=s[i];
            if(!a.equals("Null")){
                Node nn=new Node(Integer.parseInt(a));
                qp.left=nn;
                q.add(nn);
            }
            if(!s[i+1].equals("Null")){
                Node nn=new Node(Integer.parseInt(s[i+1]));
                qp.right=nn;
                q.add(nn);
            }
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> qq=new LinkedList<>();
        qq.add(new Pair(root,0));
        while(!qq.isEmpty()){
            Pair p=qq.poll();
            Node t=p.n;
            int hd=p.hd;
            if(map.get(hd)==null)map.put(hd,t.data);
            if(t.left!=null){
                qq.add(new Pair(t.left,hd-1));
            }
            if(t.right!=null){
                qq.add(new Pair(t.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> d:map.entrySet()){
            System.out.print(d.getValue()+" ");
        }
    }
}
