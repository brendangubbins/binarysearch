class Solution:
    def solve(self, prices):
        totalProfit = 0
        for index in range(1, len(prices)):
            if prices[index] - prices[index - 1] > 0:
                totalProfit += prices[index] - prices[index - 1]
        return totalProfit
        