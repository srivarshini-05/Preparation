package dynamicProgramming;
import java.util.*;
public class fuel {
    public static void liter(int[] costs,int[] vol,int n,int max){
        int[][] dp=new int[n+1][max+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=max;j++){
                if(j>=costs[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-costs[i-1]]+vol[i-1]);
                    
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=max;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        //return dp[n][max-1];
    }
    
    public static void main(String[] args){
        int n=5;
        int max=10;
        int[] costs={1,1,4,5,9};
        int[] vol={1,2,2,5,15};
        liter(costs,vol,n,max);
    }
}
