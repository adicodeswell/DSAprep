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
    public boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            boolean foundX = false;
            boolean foundY = false;

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                // Check if x and y are siblings
                if (node.left != null && node.right != null) {

                    if ((node.left.val == x && node.right.val == y) ||
                        (node.left.val == y && node.right.val == x)) {
                        return false;
                    }
                }

                // Check if x is present at this level
                if (node.val == x) {
                    foundX = true;
                }

                // Check if y is present at this level
                if (node.val == y) {
                    foundY = true;
                }

                // Add children for next level
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            // Both found at the same level
            if (foundX && foundY) {
                return true;
            }

            // Only one found â they are at different levels
            if (foundX || foundY) {
                return false;
            }
        }

        return false;
    }
}