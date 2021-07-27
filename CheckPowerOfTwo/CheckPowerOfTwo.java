import java.util.*;

class Solution {
    public boolean solve(int n) {
        int pow = 0;
        int i = 0;
        while (pow < n) {
            pow = (int)Math.pow(2, i++);
            if (pow == n)
                return true;
        }
        return false;
    }
}
