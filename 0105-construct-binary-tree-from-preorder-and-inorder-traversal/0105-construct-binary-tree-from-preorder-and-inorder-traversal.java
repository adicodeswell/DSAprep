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

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int s, int e) {

        if (s > e) {
            return null;
        }

        // First unused preorder element is the root
        TreeNode node = new TreeNode(preorder[preIndex]);
        preIndex++;

        // Find root in inorder
        int index = s;

        while (inorder[index] != node.val) {
            index++;
        }

        // Build left subtree
        node.left = build(preorder, inorder, s, index - 1);

        // Build right subtree
        node.right = build(preorder, inorder, index + 1, e);

        return node;
    }
}