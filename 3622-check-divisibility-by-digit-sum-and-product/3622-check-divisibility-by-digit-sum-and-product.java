class Solution {
    public boolean checkDivisibility(int n) {
        int j=n;
        int sum=0;
        int pro=1;
        while(j>0){
            int t=j%10;
            sum+=t;
            pro*=t;
            j=j/10;
        }
        int g=sum+pro;
        if(n%g==0) return true;
        else return false;
    }
}