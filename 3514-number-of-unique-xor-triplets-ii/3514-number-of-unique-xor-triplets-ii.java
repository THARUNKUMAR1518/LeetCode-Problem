class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX_XOR = 2048;
        boolean[] p = new boolean[MAX_XOR];
        boolean[] t = new boolean[MAX_XOR];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                p[nums[i] ^ nums[j]] = true;
            }
        }

        for (int x = 0; x < MAX_XOR; x++) {
            if (!p[x]) continue;

            for (int v : nums) {
                t[x ^ v] = true;
            }
        }

        int count = 0;
        for (boolean exists : t) {
            if (exists) count++;
        }

        return count;
    }
}