class MinStack {
    Stack<Long> s;
    long min;
    public MinStack() {
       s=new Stack<>();
       min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        long x = val;
        if(s.isEmpty()){
            min=x;
            s.push(x);
        }
        else{
            if(x>min){
                s.push(x);   
            }
            else{
                s.push(2*x-min);
                min=x;
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty())return ;
        long a=s.pop();
        if(a<min){
            min=2*min-a;
        }
    }
    
    public int top() {
        if(s.isEmpty())return -1;
        long a = s.peek();
        if(a<min){
            return (int)min;
        }
        return (int)a;
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
