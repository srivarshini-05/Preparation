class Solution {
    public String str(TreeNode root){
        if(root==null) return "null";
        StringBuilder sb=new StringBuilder("^");
        sb.append(root.val);
        sb.append(str(root.left));
        sb.append(str(root.right));
        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String a=str(root);
        String b=str(subRoot);
        return a.contains(b);
    }
}
