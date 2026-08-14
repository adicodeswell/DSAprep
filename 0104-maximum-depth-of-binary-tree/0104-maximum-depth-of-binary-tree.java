/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dfs(TreeNode root, int depth) {
        if (root == null) {
        return 0;
    }

    return 1 + Math.max(
        maxDepth(root.left),
        maxDepth(root.right)
    );
    }
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }
}