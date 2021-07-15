import java.util.*;

class Solution {
    public String solve(String sentence) {
        String arr[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            sb.append(arr[i] + " ");
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}