//2methods
//using level order,stack
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null )return false;
        Stack<TreeNode> p=new Stack<>();
        Stack<Integer> v=new Stack<>();
        p.push(root);
        v.push(root.val);
        while(!p.isEmpty()){
            TreeNode t=p.pop();
            int v1=v.pop();
            if(t.left==null && t.right==null && v1==targetSum){
                return true;
            }
            if(t.left!=null){
                p.push(t.left);
                v.push(t.left.val+v1);
            }
            if(t.right!=null){
                p.push(t.right);
                v.push(t.right.val+v1);
            }
        }
        return false;
    }
}

//praveen sir method
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    private boolean dfs(TreeNode root,int s){
        if(root==null)return false;
        s-=root.val;
        if(root.left==null && root.right==null && s==0){
            return true;
        }
        return dfs(root.left,s) || dfs(root.right,s);
    }
}
