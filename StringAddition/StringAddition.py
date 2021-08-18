class Solution:
    def solve(self, a, b):
        while len(a) < len(b):
            a = "0" + a
        while len(b) < len(a):
            b = "0" + b

        i = len(a) - 1
        carry = 0
        current = 0
        ans = ""

        while i >= 0:
            current = (int(a[i]) + int(b[i]) + carry) % 10
            carry = floor((int(a[i]) + int(b[i]) + carry) / 10)
            ans = str(current) + ans
            i -= 1
        
        if carry > 0:
            ans = str(carry) + ans

        return ans