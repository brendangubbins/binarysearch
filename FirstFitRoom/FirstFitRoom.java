import java.util.*;

class Solution {
    public int solve(int[] rooms, int target) {
        for (int room : rooms) {
            if (room >= target) {
                return room;
            }
        }
        return -1;
    }
}