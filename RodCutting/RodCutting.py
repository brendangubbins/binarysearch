class Solution:
    def solve(self, prices, n):
        dp = [0 for i in range(n+1)]
        
        for i in range(1,n+1):
            for j in range(len(prices)):
                if j < i:
                    dp[i] = max(dp[i], dp[i-j-1] + prices[j])
        
        return dp[n]
        