class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        for(int i=(2*nums.length-1);i>=0;i--){
            int ind=i%nums.length;
            while(!s.isEmpty() && s.peek()<=nums[ind]){
                s.pop();
            }
            if(s.isEmpty() && i<nums.length){
                ans[i]=-1;
            }
            else if(!s.isEmpty() && i<nums.length){
                ans[i]=s.peek();
            }
            s.push(nums[ind]);
        }
        return ans;
    }
}
