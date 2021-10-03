class Solution:
    def solve(self, prices):
        if len(prices) < 2:
            return 0
        min = prices[0]
        profit = 0
        for stock in prices:
            if stock - min > profit:
                profit = stock - min
            if min > stock:
                min = stock
        return profit
        