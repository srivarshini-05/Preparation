class Solution {
    public int histogram(int[] heights) {
        //int[] arr=new int[heights.length];
        int max=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>heights[i]){
                int el=s.pop();
                int nse=i;
                int pse=s.isEmpty()?-1:s.peek();
                int ans=heights[el]*(nse-pse-1);
                max=Math.max(max,ans);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int el=s.pop();
            int nse=heights.length;
            int pse=s.isEmpty()?-1:s.peek();
            int ans=heights[el]*(nse-pse-1);
            max=Math.max(max,ans);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;//row
        int m=matrix[0].length;
        int[][] pref=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                int num=matrix[i][j]-'0';
                if(num==0)sum=0;
                sum+=num;
                pref[i][j]=sum;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,histogram(pref[i]));
        }
        return max;
    }
}
