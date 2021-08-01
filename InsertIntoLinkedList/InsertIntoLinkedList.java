import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode head, int pos, int val) {
        if (pos == 0) {
            LLNode node = new LLNode(val);
            node.next = head;
            return node;
        }
        int count = 0;
        LLNode copy = head;
        while (count < (pos - 1)) {
            head = head.next;
            count++;
        }
        LLNode node = new LLNode(val);
        node.next = head.next;
        head.next = node;
        return copy;
    }
}
