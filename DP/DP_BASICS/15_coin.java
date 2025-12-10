package dynamicProgramming;
import java.util.*;
public class coin {
    public static int count(int[] arr,int n){
        int[] dp=new int[n+1];
        int inf=n+1;
        for(int i=1;i<=n;i++){
            dp[i]=inf;
        }
        for(int c:arr){
            for(int a=c;a<=n;a++){
                dp[a]=Math.min(dp[a],dp[a-c]+1);
            }
        }
        return dp[n]==inf?-1:dp[n];
    }
    public static void main(String[] args){
        int[] arr={1,5,2};
        //Arrays.sort(arr);
        int n=11;
        System.out.println(count(arr,n));
    }
}
