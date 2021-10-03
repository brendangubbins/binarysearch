import java.util.*;

class Solution {
    public int solve(int n) {
        String num = Integer.toString(n);
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < num.length(); i++) {
            
            String sub1 = num.substring(0, i + 1);
            String sub2 = num.substring(i + 1, num.length());

            if (Integer.parseInt(sub1 + "5" + sub2) > maxValue) {
                maxValue = Integer.parseInt(sub1 + "5" + sub2);
            } 
            if (sub1.charAt(0) != '-' && Integer.parseInt("5" + sub1 + sub2) > maxValue) {
                maxValue = Integer.parseInt("5" + sub1 + sub2);
            }
            
        }

        return maxValue;
    }
}
