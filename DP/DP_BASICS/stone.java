package dynamicProgramming;
import java.util.*;
public class stone {
    public static boolean sto(int[] arr){
        int n=arr.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=arr[i];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                dp[i][j]=Math.max(arr[i]-dp[i+1][j],arr[j]-dp[i][j-1]);
            }
        }
        return (dp[0][n-1])>0;
    }
    public static void main(String[] args){
        int[] arr={5,3,4,5};
        System.out.println(sto(arr));
    }
}
