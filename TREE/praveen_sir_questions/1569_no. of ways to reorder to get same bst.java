class Solution {
    public long helper(List<Integer> arr){
        int n=arr.size();
        if(n<3)return 1;
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();

        for(int i=1;i<n;i++){
            if(arr.get(i)<arr.get(0)){
                left.add(arr.get(i));
            }
            else{
                right.add(arr.get(i));
            }
        }
        long lefts=helper(left)%mod;
        long rights=helper(right)%mod;

        return(((lefts*rights)%mod)*table[n-1][left.size()])%mod;
    }
    long mod=(long)1e9+7;
    long[][] table;
    public int numOfWays(int[] nums) {
        
        int n=nums.length;
        table=new long[n][n];
        for(int i=0;i<n;i++){
            table[i][0]=table[i][i]=1;
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                table[i][j]=(table[i-1][j-1]+table[i-1][j])%mod;
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(int i:nums) arr.add(i);
        return (int)((helper(arr)-1)%mod);

    }
}
