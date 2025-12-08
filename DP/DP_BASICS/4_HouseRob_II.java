package dynamicProgramming;
import java.util.*;
public class rob1 {
    public static int rob(int[] arr){
        int n=arr.length;
        //if(n==1){
         //   return arr[0];
        //}
        int[] dp=new int[n];
        dp[0]=arr[0];

        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }
    public static int rob2(int[] arr,int start,int stop){
        int n=stop-start+1;
        int[] dp=new int[n];
        dp[0]=arr[start];
        dp[1]=Math.max(arr[start],arr[start+1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[start+i]);
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int[] arr={2,3,4,8};
        int n=arr.length;
        int a=rob2(arr,0,n-2);
        int b=rob2(arr,1,n-1);
        System.out.print(Math.max(a,b));
        }
}
