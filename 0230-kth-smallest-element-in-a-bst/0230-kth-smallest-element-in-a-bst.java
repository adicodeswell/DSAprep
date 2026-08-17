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

    int k;
    int answer;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;

        inorder(root);

        return answer;
    }

    private void inorder(TreeNode node) {

        if (node == null) {
            return;
        }

        inorder(node.left);

        k--;

        if (k == 0) {
            answer = node.val;
            return;
        }

        inorder(node.right);
    }
}