class Solution {
    public int climbStairs(int n) {
      if(n<=3) return n;
      int p=3;
      int k=2;
      int cu=0;
      for(int i=p;i<n;i++){
        cu=p+k;
        k=p;
        p=cu;
      }
      return cu;
    }
}