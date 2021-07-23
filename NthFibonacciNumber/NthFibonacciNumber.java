import java.util.*;

class Solution {
    public int solve(int n) {
        int first = 1;
        int second = 1;
        int fib = 1;
        for (int i = 2; i < n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        return fib;
    }
}