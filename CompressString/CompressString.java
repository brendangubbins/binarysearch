import java.util.*;

class Solution {
    public String solve(String s) {
        char previous = ' ';
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != previous) {
                ans += s.charAt(i);
                previous = s.charAt(i);
            }
        }
        return ans;
    }
}