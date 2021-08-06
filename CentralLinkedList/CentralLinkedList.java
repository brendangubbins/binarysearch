import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        int length = 0;
        LLNode copy = node;
        while (node != null) {
            node = node.next;
            length++;
        }
        int i = 0;
        while (i < length / 2) {
            copy = copy.next;
            i++;
        }
        return copy.val;
    }
}
