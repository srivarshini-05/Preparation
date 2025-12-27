//Hint-->previous greater....curr index-prev greater index=ans

class StockSpanner {
    Stack<int[]>s=new Stack<>();
    int ind;
    public StockSpanner() {
        ind=-1;
    }
    
    public int next(int price) {
        ind+=1;
        while(!s.isEmpty() && s.peek()[0]<=price){
            s.pop();
        }
        int ans=ind-(s.isEmpty()?-1:s.peek()[1]);
        s.push(new int[]{price,ind});
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
