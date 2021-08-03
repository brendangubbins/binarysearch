import java.util.*;

class Solution {
    public String solve(int n) {
        if (n == 0) return "0";
        String ans = "";
        while (n > 0) {
            ans = Integer.toString(n % 3) + ans;
            n /= 3;
        }
        return ans;
    }
}
