class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int n=position.length;
        int h=position[n-1]-position[0];
        int ans;
        while(l<=h){
            int mid=(l+h)/2;
            if(canplace(position,mid,m)){
                //ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return h;
    }
    public static boolean canplace(int[] arr,int dis,int m){
        int cc=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dis){
                cc++;
                last=arr[i];
            }
            if(cc>=m){
                return true;
            }
        }
        return false;
    }
}
