class Solution:
    def solve(self, nums):
        my_dict = dict()

        for num in nums:
            if num in my_dict:
                my_dict[num] += 1
            else:
                my_dict[num] = 1

        for val in my_dict:
            if my_dict[val] % 2 != 0:
                return False
        
        return True