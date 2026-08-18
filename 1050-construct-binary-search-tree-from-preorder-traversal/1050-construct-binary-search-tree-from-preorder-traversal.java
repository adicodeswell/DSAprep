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

    int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int upperBound) {

        // No more elements OR this value doesn't belong
        // to the current subtree
        if (index == preorder.length || preorder[index] > upperBound) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[index]);
        index++;

        // Everything smaller belongs to the left subtree
        node.left = build(preorder, node.val);

        // Values up to the parent's bound can belong here
        node.right = build(preorder, upperBound);

        return node;
    }
}