import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        if (root == null)
            return 0;

        if (root.right != null && 
        root.right.left == null && 
        root.right.right == null)
            return root.right.val + solve(root.left);

        return solve(root.left) + solve(root.right);
    }
}
