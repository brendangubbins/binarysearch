import java.util.*;

class Solution {
    public int solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int largest = 0;
        for (int value : map.values()) {
            if (value > largest)
                largest = value;
        }
        return largest;
    }
}
