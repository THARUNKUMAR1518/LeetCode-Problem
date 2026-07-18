class Solution {
    public int findGCD(int[] nums) {
    Arrays.sort(nums);
    int a=nums[nums.length-1];
    int b=nums[0];
    int v=0;
    for(int i=a;i>=1;i--){
        if(a%i==0 && b%i==0){
            v=i;
            break;
        }
    }
    return v;
    }
}