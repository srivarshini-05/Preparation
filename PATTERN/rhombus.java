import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i-1;j>=0;j--){
                System.out.print(" ");}
                for(int k=1;k<=n;k++){
                    System.out.print("* ");
                }
            System.out.println();            
        }
    }
}
