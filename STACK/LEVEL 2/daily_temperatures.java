class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>st=new Stack<>();
        int[] arr=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()[0]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()) arr[i]=0;
            if(!st.isEmpty()){
                int ans=st.peek()[1]-i;
                arr[i]=ans;
            }
            st.push(new int[]{temperatures[i],i});
    }
    return arr;
}}
