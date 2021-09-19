import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (Integer val : map.values()) {
            if (val == map.get(val))
                return true;
        }
        return false;
    }
}
