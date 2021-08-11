class Solution:
    def solve(self, nums, k):
        i = 0
        j = len(nums) - 1
        
        while i < j:
            if nums[i] + nums[j] == k:
                return True
            if nums[i] + nums[j] < k:
                i += 1
            else:
                j -= 1
        return False