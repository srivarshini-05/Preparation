class Solution {
    public int hammingDistance(int x, int y) {
        int p=x^y;
        int c=0;
        while(p>0){
            if(p%2==1){
                c++;
            }
            p=p/2;
        }
        return c;
    }
}
