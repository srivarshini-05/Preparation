class Solution {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return ans;
    }
    public void dfs(TreeNode root,int s){
        if(root==null) return ;
        s-=root.val;
        t.add(root.val);
        if(root.left==null && root.right==null && s==0){
            ans.add(new ArrayList<>(t));
        }
        dfs(root.left,s);
        dfs(root.right,s);
        t.remove(t.size()-1);
    }
}
