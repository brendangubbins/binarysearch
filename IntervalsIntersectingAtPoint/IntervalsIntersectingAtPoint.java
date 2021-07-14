import java.util.*;

class Solution {
    public int solve(int[][] intervals, int point) {
        int count = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= point && intervals[i][1] >= point)
                count++;
        }
        return count;
    }
}