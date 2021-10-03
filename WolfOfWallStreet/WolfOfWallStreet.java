import java.util.*;

class Solution {
    public int solve(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int diff = 0;
        for (int i = 0; i < prices.length; i++) {
            if (diff < prices[i] - min) {
                diff = prices[i] - min;
            }
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        return diff;
    }
}
