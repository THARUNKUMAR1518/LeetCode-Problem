class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] f = Arrays.stream(nums).filter(n -> n > 0).toArray();
        Arrays.sort(f);
        int t = 1;
        for (int n : f) {
            if (n == t) {
                t++;
            }
        }
        return t;        
    }
}