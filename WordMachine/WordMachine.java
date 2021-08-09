import java.util.*;

class Solution {
    public int solve(String[] ops) {
        Stack<String> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("POP")) {
                if (stack.empty())
                    return -1;
                stack.pop();
            } 

            else if (op.equals("DUP")) {
                if (stack.empty())
                    return -1;
                stack.push(stack.peek());
            } 

            else if (op.equals("+")) {
                if (stack.size() <= 1)
                    return -1;
                int top = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(top + second));
            } 

            else if (op.equals("-")) {
                if (stack.size() <= 1)
                    return -1;
                int top = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(top - second));
            } 

            else {
                stack.push(op);
            }
        }
        return stack.size() == 0 ? -1 : Integer.parseInt(stack.peek());
    }
}
