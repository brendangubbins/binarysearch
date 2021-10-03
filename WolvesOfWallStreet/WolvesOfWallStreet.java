import java.util.*;

class Solution {
    public int solve(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[i - 1];
            if (currentProfit > 0) {
                totalProfit += currentProfit;
            }
        }
        return totalProfit;
    }
}
