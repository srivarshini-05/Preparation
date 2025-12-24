class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int[] fs=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()) fs[i]=-1;
            else{
                fs[i]=s.peek();
            }
            s.push(nums2[i]);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=fs[j];
                }
            }
        }
        return ans;
    }
}
