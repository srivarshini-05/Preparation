
import java.util.*;
public class tri {
    public static int tria(List<List<Integer>> arr){
        int n=arr.size();
        int[] dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[j]=Math.min(dp[j],dp[j+1])+arr.get(i).get(j);
            }
        }
        return dp[0];
    }
    public static void main(String[] args){
        List<List<Integer>> arr=Arrays.asList(Arrays.asList(2),Arrays.asList(3,4),Arrays.asList(6,5,7),Arrays.asList(4,1,8,3));
        System.out.print(tria(arr));
    }
}
