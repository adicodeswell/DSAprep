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
    public int rangeSumBST(TreeNode root, int low, int high) {
        calculate(root, low, high);

        return sum;
    }

    public void calculate(TreeNode node, int low, int high) {
        if(node == null) {
            return;

        } else if(node.val < low) {

            calculate(node.right, low, high);

        } else if(node.val > high) {

            calculate(node.left, low, high);

        } else {

            sum += node.val;
            calculate(node.left, low, high);
            calculate(node.right, low, high);

            return;
        }

    }
}