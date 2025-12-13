import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){// 4 3 2 1
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){//1   4
            for(int k=1;k<=i;k++){//1  <=4
                System.out.print(" ");
            }
            for(int j=i;j<=n-1;j++){// 1    4    4     2
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
