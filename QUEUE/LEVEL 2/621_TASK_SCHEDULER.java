class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr=new int[26];
        for(char c:tasks){
            arr[c-'A']++;
        }
        Arrays.sort(arr);
        int max=arr[25];
        int idle=(max-1)*n;
        for(int i=24;i>=0;i--){
            idle-=Math.min(max-1,arr[i]);
        }
        idle=Math.max(0,idle);
        return tasks.length+idle;
    }
}
