import java.util.*;

class Solution {
    public int solve(int[] nums) {
        if (nums.length == 2) {
            return nums[0] + (nums[1] - nums[0])/2;
        }
        
        Arrays.sort(nums);
        int seq = nums[1] - nums[0];
        int lowestSeq = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] < lowestSeq)
                lowestSeq = nums[i] - nums[i-1];     
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] != lowestSeq)
                return nums[i-1] + lowestSeq;
        }
        return nums[0];
    }
}
