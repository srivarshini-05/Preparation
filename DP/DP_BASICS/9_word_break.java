package dynamicProgramming;
import java.util.*;
public class wordbreak {
    public static boolean word(String s,List<String> arr){
        Set<String> h=new HashSet<>(arr);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && h.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        String s="leetcode";
        List<String> arr=Arrays.asList("leet","code");
        //String[] arr={"leet","code"};
        System.out.println(word(s,arr));
    }
}
