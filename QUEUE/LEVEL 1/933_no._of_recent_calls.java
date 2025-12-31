class RecentCounter {
    Deque<Integer> q;
    Deque<Integer> q1;
    public RecentCounter() {
        q=new ArrayDeque<>();
        q1=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        q1=q;
        while(!q1.isEmpty()){
            if(q1.peek()<t-3000){
                q1.poll();
            }else{
                break;
            }
        }
            return q1.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
