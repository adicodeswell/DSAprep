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
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    public int findDepth(TreeNode node, int level) {
        if(node == null) return level;

        int left = findDepth(node.left, level+1);
        int right = findDepth(node.right, level+1);

        return Math.max(left, right);
    }
}