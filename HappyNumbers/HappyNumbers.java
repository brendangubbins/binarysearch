import java.util.*;

class Solution {
    public boolean solve(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = n;
        while (sum != 1) {
            n = sum;
            sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
        }
        return true;
    }
}
