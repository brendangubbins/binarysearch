import java.util.*;

class Solution {
    public boolean solve(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}