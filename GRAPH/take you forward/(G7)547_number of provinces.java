class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,int i){
        vis[i]=1;
        for(int j:adj.get(i)){
            if(vis[j]!=1){
                dfs(adj,vis,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        int v=isConnected.length;
        //int m=isConnected.length;
        //int n=isConnected[0].length;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }

            }
        }
        int c=0;
        int[] vis=new int[v];
        for(int i=0;i<v;i++){
            if(vis[i]!=1){
                c++;
                dfs(adj,vis,i);
            }
            
        }
        return c;
    }
}
