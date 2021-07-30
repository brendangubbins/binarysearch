import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        boolean seen = false;
        int firstOne = 0;
        int lastOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!seen && nums[i] == 1) {
                seen = true;
                firstOne = i;
            }
            if (nums[i] == 1) {
                lastOne = i;
            }
        }
        for (int i = firstOne; i < lastOne; i++) {
            if (nums[i] != 1)
                return false;
        }
        return true;
    }
}
