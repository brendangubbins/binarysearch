import java.util.*;

class Solution {
    public boolean solve(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else map.put(s.charAt(i), 1);
        }
        int count = 0;
        for (int val : map.values()) {
            if (val % 2 == 1) 
                count++;
        }
        return count <= 1;
    }
}