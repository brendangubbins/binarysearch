class Solution:
    def solve(self, nums):
        my_set = set()
        for num in nums:
            if num in my_set:
                return num
            my_set.add(num)