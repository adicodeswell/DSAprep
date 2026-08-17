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
    public TreeNode deleteNode(TreeNode root, int key) {

        // Key not found
        if (root == null) {
            return null;
        }

        // Search left
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // Search right
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // Found the node
        else {

            // No left child
            if (root.left == null) {
                return root.right;
            }

            // No right child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            // Replace current value with successor
            root.val = successor.val;

            // Delete the original successor
            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }
}