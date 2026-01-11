class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        int c=0;
        Deque<Integer> dq=new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1) ans[c++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}
