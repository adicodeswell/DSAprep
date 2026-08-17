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
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums, 0, nums.length - 1);
    }

    public TreeNode create(int[] nums, int s, int e) {
        TreeNode node = new TreeNode();
        if (s>e) {
            return null;
        }
        int mid = s + (e - s) / 2;
        node.val = nums[mid];
        node.left = create(nums, s, mid - 1);
        node.right = create(nums, mid + 1, e);

        return node;
    }
}