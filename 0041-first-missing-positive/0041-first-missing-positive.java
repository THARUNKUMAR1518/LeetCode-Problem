class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int t = 1;
        for (int n : nums) {
            if (n == t) {
               t++;
            }
        }
        return t;        
    }
}