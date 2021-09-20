import java.util.*;

class Solution {
    public boolean solve(int n, int[][] friends) {
        int f = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < friends.length; i++) {
            if (friends[i].length <= 1) {
                return false;
            } else {
                set.add(friends[i][0]);
                set.add(friends[i][1]);
            }
        }
        return set.size() == n;
    }
}
