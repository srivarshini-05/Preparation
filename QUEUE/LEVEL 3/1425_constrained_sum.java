class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<Integer> d=new ArrayDeque<>();
        int[] sum=new int[nums.length];
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            sum[i]=nums[i];
            if(!d.isEmpty() && i-d.peek()>k){
                d.poll();
            }
            if(!d.isEmpty()){
                sum[i]+=sum[d.peek()];
            }
            while(!d.isEmpty() && sum[i]>=sum[d.peekLast()]){
                d.pollLast();
            }
            if(sum[i]>0){
                d.offerLast(i);
            }
            res=Math.max(res,sum[i]);
        }
        return res;
    }
}
