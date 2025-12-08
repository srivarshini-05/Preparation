
import java.util.*;
public class mincoststair {
    public static int mini(int[] cost){
        int n=cost.length;
        int[] dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            int mincost=Math.min(dp[i-1],dp[i-2]);
            dp[i]=mincost+cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        int[] cost={10,15,20};
        System.out.print(mini(cost));
    }
}
