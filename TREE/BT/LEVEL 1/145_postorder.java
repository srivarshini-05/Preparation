class Solution {
    public void dfs(TreeNode root,List<Integer> l){
        if(root==null)return;
        dfs(root.left,l);
        
        dfs(root.right,l);
        l.add(root.val);
        return;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        dfs(root,l);
        return l;
    }
}
