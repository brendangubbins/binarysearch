class Solution:
    def solve(self, nums):
        carry = 1
        for i in reversed(range(len(nums))):
            current_num = (nums[i] + carry)
            nums[i] = (nums[i] + carry) % 10
            if current_num > 0:
                carry = (int)(current_num / 10)
            else:
                carry = 0
        if carry > 0:
            nums.insert(0, carry)
        return nums