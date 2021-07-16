import java.util.*;

class Solution {
    public boolean solve(int n) {
        int length = Integer.toString(n).length();
        int copy = n;
        int narc = 0;
        while (copy > 0) {
            narc += Math.pow(copy % 10, length);
            copy /= 10;
        }
        return narc == n;
    }
}