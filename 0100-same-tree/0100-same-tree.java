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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both are empty â same
        if (p == null && q == null) {
            return true;
        }

        // One is empty â different
        if (p == null || q == null) {
            return false;
        }

        // Values are different â different
        if (p.val != q.val) {
            return false;
        }

        boolean left = isSameTree(p.left , q.left);
        boolean right = isSameTree(p.right , q.right);

        if(left == true && right == true) {
            return true;
        }
        return false;
    }
}