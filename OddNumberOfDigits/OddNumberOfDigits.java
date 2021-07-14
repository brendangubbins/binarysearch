import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int digitCount = 0;
            while (num > 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 1)
                ans++;
        }
        return ans;
    }
}