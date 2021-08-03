import java.util.*;

class Solution {
    public int solve(String s) {
        if (s.length() == 0)
            return 0;
        char prev = ' ';
        int count = 1;
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                count++;
                prev = s.charAt(i);
                if (count > ans) {
                    ans = count;
                }
            } else {
                count = 1;
                prev = s.charAt(i);
            }
        }
        return ans;
    }
}
