class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                int n=Integer.parseInt(s);
                st.push(n);
            }
            else{
                    int a=st.pop();
                    int b=st.pop();
                    if(s.equals("+")){
                        st.push(b+a);
                    }
                    else if(s.equals("-")){
                        st.push(b-a);
                    }
                    else if(s.equals("*")){
                        st.push(b*a);
                    }
                    else if(s.equals("/")){
                        st.push(b/a);
                    }
                }
            
        }
        return st.pop();
    }
}
