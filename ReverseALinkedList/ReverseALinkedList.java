import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
        LLNode list = node;
        LLNode prev = null;
        while (list != null) {
            LLNode temp = list.next;
            list.next = prev;
            prev = list;
            list = temp;
        }
        return prev;
    }
}
