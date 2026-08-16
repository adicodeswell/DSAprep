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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }

        cal(root.left, 0);
        cal(root.right, 1);

        return sum;
    }

    public void cal(TreeNode node, int flag) {
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null) {
            if(flag == 0) {
                sum+=node.val;
            }
            return;
        }

        cal(node.left, 0);
        cal(node.right, 1);
    }
}