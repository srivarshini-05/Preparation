class Solution {
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        List<Integer> modes=new ArrayList<>();
        dfs(root,modes);
        int[] ans=new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            ans[i]=modes.get(i);
        }
        return ans;
    }
    public void dfs(TreeNode root,List<Integer> modes){
        if(root==null) return ;
        dfs(root.left,modes);
        if(prev!=null){
        if(prev==root.val){
            count++;
        }
        else{
            count=1;
        }}
        if(count>max){
            max=count;
            modes.clear();
            modes.add(root.val);
        }
        else if(count==max){
            modes.add(root.val);
        }
        
        prev=root.val;
        dfs(root.right,modes);
    }
}
