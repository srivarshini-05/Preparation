/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class pair{
    TreeNode n;
    int v;
    int l;
    pair(TreeNode n,int v,int l){
        this.n=n;
        this.v=v;
        this.l=l;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            TreeNode n=p.n;
            int v=p.v;
            int l=p.l;
            if(!map.containsKey(v)){
                map.put(v,new TreeMap<>());
            }
            if(!map.get(v).containsKey(l)){
                map.get(v).put(l,new PriorityQueue<>());
            }
            map.get(v).get(l).add(n.val);
            if(n.left!=null){
                q.add(new pair(n.left,v-1,l+1));
            }
            if(n.right !=null){
                q.add(new pair(n.right,v+1,l+1));
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> k: map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> g : k.values()){
                while(!g.isEmpty()){
                ans.get(ans.size()-1).add(g.poll());
            }}
        }
        return ans;
        
    }
}
