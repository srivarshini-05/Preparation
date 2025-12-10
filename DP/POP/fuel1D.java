package dynamicProgramming;
import java.util.*;
public class fuel1D {
    public static int liter(int[] costs,int[] vol,int n,int max){
        int[] dp=new int[max+1];
        for(int i=1;i<=n;i++){
            for(int j=max;j>=1;j--){
                if(j>=costs[i-1]){
                    dp[j]=Math.max(dp[j],dp[j-costs[i-1]]+vol[i-1]);
                }
                else{
                    dp[j]=dp[j];
                }
                
            }
        }

        return dp[max];
    }
    
    public static void main(String[] args){
        int n=5;
        int max=10;
        int[] costs={1,1,4,5,9};
        int[] vol={1,2,2,5,15};
        System.out.println(liter(costs,vol,n,max));
    }
}
