class Solution {
    static void fun(int i,int[] arr,List<List<Integer>> ans,List<Integer> list){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        fun(i+1,arr,ans,list);
        list.add(arr[i]);
        fun(i+1,arr,ans,list);
        list.remove(list.size()-1);
            
        }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>(); 
        fun(0,nums,ans,new ArrayList<>());
        return ans;
    }
}
