import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        LLNode copy = node;
        int length = 0;
        int ans = 0;

        while (copy != null) {
            copy = copy.next;
            length++;
        }

        for (int i = length - 1; i >= 0; i--) {
            if (node.val == 1)
                ans += Math.pow(2, i);
            node = node.next;
        }

        return ans;
    }
}