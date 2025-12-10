package dynamicProgramming;
import java.util.*;
public class wire {
    public static void fun(int[] arr,int n){
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=n;j++){
                if(dp[j-i-1]!=Integer.MIN_VALUE)
                {
                    dp[j] = Math.max(dp[j-i-1] + arr[i],dp[j]);
                }
            }
        }
        System.out.println(dp[n]);
    }
    public static void main(String args[])
    {
        int[] arr={1,5,8,9};
        int n=4;
        fun(arr,n);
    }
}
