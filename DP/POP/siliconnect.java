//difference
import java.util.*;
public class siliconnect {
    public static int diff(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
        for(int i=2;i<n;i++){
            dp[i]=Math.min(Math.abs(arr[i]-arr[i-2])+dp[i-2],Math.abs(arr[i]-arr[i-1])+dp[i-1]);
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int[] arr={30,10,60,10,60,50};
        System.out.print(diff(arr));
    }
}
