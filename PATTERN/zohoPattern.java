import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        int days[] = new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            days[i] = Integer.parseInt(s1[i]);
        }
        
        int cost[] = new int[3];
        for(int p=0;p<3;p++)
        {
            cost[p] = sc.nextInt();
        }
        HashSet<Integer> h=new HashSet<>();
        for(int d=0;d<days.length;d++){
            h.add(days[d]);
        }
        int m=Integer.MIN_VALUE;
        for(int i=0;i<days.length;i++){
            if(m<days[i]){
                m=days[i];
            }
        }
        int[] dp=new int[m+1];
        dp[0]=0;
        for(int i=1;i<m+1;i++){
            if(!h.contains(i)){
                dp[i]=dp[i-1];
            }
            else{
                int a = dp[i-1]+cost[0];
                int b = (i-7<0)?dp[0]+cost[1]:dp[i-7]+cost[1];
                int c = (i-30<0)?dp[0]+cost[2]:dp[i-30]+cost[2];
                dp[i]=Math.min(Math.min(a,b),c);
            }
        }
        System.out.print(dp[m]);
        }
        
    }
