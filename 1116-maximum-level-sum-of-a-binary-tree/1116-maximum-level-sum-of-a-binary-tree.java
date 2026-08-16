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
 *         this.right = righttps://leetcode.com/u/dev_adijha$0ht;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int out = 0;
        int sum = Integer.MIN_VALUE;
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        int level = 1;

        while(!que.isEmpty()) {
            int levelSize = que.size();
        
            int currentSum = 0;
        
            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = que.poll();
                currentSum += currentNode.val;

                if(currentNode.left != null) {
                    que.offer(currentNode.left);
                }
        
                if(currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }
            if(currentSum > sum) {
                out = level;
                sum = currentSum;
            }
        
            level++;
        }

        return out;
    }
}