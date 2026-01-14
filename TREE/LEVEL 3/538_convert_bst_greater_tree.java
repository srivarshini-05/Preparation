class Solution {
     int n=0;
    public TreeNode convertBST(TreeNode root) {
        
        if(root==null) return root;
        convertBST(root.right);
        n+=root.val;
        root.val=n;
        convertBST(root.left);
        return root;
    }
}
