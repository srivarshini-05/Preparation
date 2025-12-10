package dynamicProgramming;
import java.util.*;
public class unipath {
    public static int uni(int m,int n){
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][n-1]=1;
        }
        for(int j=0;j<n;j++){
            dp[m-1][j]=1;
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                dp[i][j]=dp[i][j+1]+dp[i+1][j];
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args){
        int m=3;
        int n=7;
        System.out.print(uni(m,n));
    }
}
