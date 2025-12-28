class Solution {
    public int largestRectangleArea(int[] heights) {
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
}
