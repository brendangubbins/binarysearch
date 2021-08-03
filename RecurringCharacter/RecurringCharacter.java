import java.util.*;

class Solution {
    public int solve(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                return i;
            set.add(s.charAt(i));
        }
        return -1;
    }
}
