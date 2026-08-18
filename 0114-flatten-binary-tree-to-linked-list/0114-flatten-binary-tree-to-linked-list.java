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
    public void flatten(TreeNode node) {
        if(node == null) {
            return;
        }

        flatten(node.left);

        if(node.left != null) {
            TreeNode temp = node.right;
            node.right = node.left;
            TreeNode templeft = node.right;
            while(templeft.right != null) {
                templeft = templeft.right;
            }
            templeft.right = temp; 
            node.left = null;
        }

        flatten(node.right);

        return;
    }
}