class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        fn(0,nums,ans,new ArrayList<>());
        return new ArrayList<>(ans);
    }
    static void fn(int i,int[] arr,Set<List<Integer>> ans,List<Integer> list){
        if(i==arr.length){
            
            ans.add(new ArrayList<>(list));
            return;
        }
        fn(i+1,arr,ans,list);
        list.add(arr[i]);
        fn(i+1,arr,ans,list);
        list.remove(list.size()-1);
    }
}
