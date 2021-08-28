import java.util.*;

class Solution {
    public int solve(int[] prices, int n) {
        int dp[] = new int[n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < prices.length; j++) {
                if (j < i) {
                    dp[i] = Math.max(dp[i], dp[i-j-1] + prices[j]);
                }
            }
        }

        return dp[n];
    }
}
