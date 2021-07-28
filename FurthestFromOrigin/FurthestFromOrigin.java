import java.util.*;

class Solution {
    public int solve(String s) {
        int distance = 0;
        int bonus = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                distance--;
            else if (s.charAt(i) == 'R')
                distance++;
            else if (s.charAt(i) == '?')
                bonus++;
        }
        int ans = Math.abs(distance) + Math.abs(bonus);
        return ans;
    }
}
