package dynamicProgramming;
import java.util.*;
public class equalsum {
    public static boolean check(int[] arr){
        int sum=0;
        for(int ar:arr){
            sum+=ar;
        }
        if(sum%2!=0){
            return false;
        }
        
        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for (int num : arr) {
    for (int j = target; j >= num; j--) {
        dp[j] = dp[j] || dp[j - num];
    }
}
    return dp[target];}
    
    public static void main(String[] args){
        int[] arr={5,1,5,11};
        System.out.println(check(arr));
    }
}
