class Solution {
    public boolean isValid(String s) {
       
        Stack<Character> s1=new Stack<>();
        //char[] r=s.toCharArray();
        for(char i:s.toCharArray()){
            if(i=='{' ){
                s1.push('}');
            }
            else if(i=='(' ){
                s1.push(')');
            }
            else if(i=='['){
                s1.push(']');
            }
            else if (s1.isEmpty() || s1.pop()!=i){
                return false;
            }
        }
        if(s1.size()==0)return true;
        return false;
        
    }
}
