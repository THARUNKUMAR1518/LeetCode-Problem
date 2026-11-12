class Solution:
    def longestMonotonicSubarray(self, nums):
        n = len(nums)
        increasing = 1
        decreasing = 1
        max_length = 1
        for i in range(1, n):
            if nums[i] > nums[i - 1]:
                increasing += 1
                decreasing = 1
            elif nums[i] < nums[i - 1]:
                decreasing += 1
                increasing = 1
            else:
                increasing = 1
                decreasing = 1
            x = increasing if increasing > decreasing else decreasing
            max_length = max_length if max_length > x else x
        return max_length