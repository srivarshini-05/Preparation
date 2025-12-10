package dynamicProgramming;
import java.util.*;
public class regexp {
    public static boolean check(String s,String p){
        int m=s.length(),n=p.length();
        boolean[][] f=new boolean[m+1][n+1];
        f[0][0]=true;
        for(int i=0;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(p.charAt(j-1)=='*'){
                    f[i][j]=f[i][j-2];
                    if(i>0 && (p.charAt(j-2)=='.'|| p.charAt(j-2)==s.charAt(i-1))){
                        f[i][j]|=f[i-1][j];
                    }
                }
                else if(i>0 && (p.charAt(j-1)=='.' || p.charAt(j-1)==s.charAt(i-1))){
                    f[i][j]=f[i-1][j-1];
                }
            }
        }
        return f[m][n];
    }
    public static void main(String[] args){
        String s="ab";
        String p="a*";
        System.out.print(check(s,p));
    }
}

//.-->one single char
//* --->zero or more  preceding character
