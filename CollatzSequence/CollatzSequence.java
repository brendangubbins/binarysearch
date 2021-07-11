import java.util.*;

class Solution {
    public int solve(int n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            }
            else {
                n = (3 * n) + 1;
                count++;
            }
        }
        return count;
    }
}