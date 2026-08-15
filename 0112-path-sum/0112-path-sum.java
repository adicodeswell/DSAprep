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

    int flag = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        check(root, 0, targetSum);

        return flag == 1;
    }

    public void check(TreeNode node, int currSum, int targetSum) {

        if (node == null) {
            return;
        }

        currSum += node.val;

        // We reached a leaf
        if (node.left == null && node.right == null) {

            if (currSum == targetSum) {
                flag = 1;
            }
            return;
        }

        check(node.left, currSum, targetSum);
        check(node.right, currSum, targetSum);
    }
}