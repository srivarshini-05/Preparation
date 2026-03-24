import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class node{
  int data;
  ArrayList<node> next;
  node(int val){
    this.data=val;
    this.next=new ArrayList<>();
  }}
public class Solution{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Queue<node> q=new LinkedList<>();
    int val=sc.nextInt();
    node root=new node(val);
    q.add(root);
    while(!q.isEmpty()){
      node r=q.poll();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
        node nn=new node(sc.nextInt());
        r.next.add(nn);
        q.add(nn);
      }
    }
    System.out.println(sum(root));
    dfs(root);
  }
  static int sum(node root){
    int k=root.data;
    for(node l:root.next){
      k+=sum(l);
    }
    return k;
  }
 static void dfs(node root){
   Queue<node> ans=new LinkedList<>();
   ans.add(root);
   while(!ans.isEmpty()){
     node pop=ans.poll();
     System.out.print(pop.data+" ");
     for(node n1:pop.next){
       ans.add(n1);
     }
   }
 }
}
