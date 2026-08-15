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
    List<Long> sums = new ArrayList<>();
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        calculate(root, targetSum);
        return count;
    }

    public void calculate(TreeNode node, int tarSum) {

        if (node == null) {
            return;
        }

        for (int i = 0; i < sums.size(); i++) {
            sums.set(i, sums.get(i) + node.val);

            if (sums.get(i) == (long) tarSum) {
                count++;
            }
        }

        if ((long) node.val == tarSum) {
            count++;
        }

        sums.add((long) node.val);

        calculate(node.left, tarSum);
        calculate(node.right, tarSum);

        // Backtrack
        sums.remove(sums.size() - 1);

        for (int i = 0; i < sums.size(); i++) {
            sums.set(i, sums.get(i) - node.val);
        }
    }
}