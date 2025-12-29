class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastindex=new int[26];
        boolean[] b=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            lastindex[c-'a']=i;
        }
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (b[ch-'a']) continue;
            while(!st.isEmpty() && i<lastindex[st.peek()-'a'] && ch<st.peek()){
                char p=st.pop();
                b[p-'a']=false;

            }
            st.push(ch);
            b[ch-'a']=true;
             
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            String a=String.valueOf(st.pop());
            sb.append(a);
        }
        return sb.reverse().toString();
    }
}
