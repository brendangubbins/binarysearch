import java.util.*;

class Solution {
    public boolean solve(String s) {
        HashSet<Character> set = new HashSet();
        for (char c : s.toCharArray()) {
            if (set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }
}