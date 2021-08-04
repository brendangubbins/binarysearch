import java.util.*;

class Solution {
    public int solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else 
                stack.push(s.charAt(i));
        }
        return stack.size();
    }
}
