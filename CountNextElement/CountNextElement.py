class Solution:
    def solve(self, nums):
        count = 0
        nums_set = set(nums)
        for num in nums:
            if num + 1 in nums_set:
                count+=1
        return count
        