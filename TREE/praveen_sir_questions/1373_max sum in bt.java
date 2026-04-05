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
class Node{
    int min,max,sum;
    Node(int min,int max,int sum){
        this.min=min;
        this.max=max;
        this.sum=sum;
    }
}
class Solution {
    int ans=0;
    public int maxSumBST(TreeNode root) {
        helper(root);
        return ans;
    }
    public Node helper(TreeNode root){
        if(root==null){
            return new Node(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }

        Node left=helper(root.left);
        Node right=helper(root.right);

        if(left.max<root.val && root.val<right.min){
            int curr=left.sum+right.sum+root.val;

            ans=Math.max(curr,ans);
            return new Node(Math.min(root.val,left.min),Math.max(root.val,right.max),curr);
        }
        return new Node(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    }
}
