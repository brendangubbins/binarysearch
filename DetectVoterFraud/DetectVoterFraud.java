import java.util.*;

class Solution {
    public boolean solve(int[][] votes) {
        HashSet<Integer> voters = new HashSet<>();
        for (int i = 0; i < votes.length; i++) {
            int voter = votes[i][1];
            if (voters.contains(voter))
                return true;
            voters.add(voter);
        }
        return false;
    }
}
