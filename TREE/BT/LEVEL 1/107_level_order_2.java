class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> sub=new LinkedList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left !=null) q.offer(q.peek().left);
            if(q.peek().right !=null) q.offer(q.peek().right);
            sub.add(q.poll().val);
            }
            ans.addFirst(sub);


        }
        return ans;
    }
}
