import java.util.*;

class Solution {
    public int solve(int n) {
        String binary = "";
        int ans = 0;
        while (n > 0) {
            if (n % 2 == 1)
                ans++;
            n /= 2;
        }
        return ans;
    }
}