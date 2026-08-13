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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        int level = 0;

        while(!que.isEmpty()) {
            int levelSize = que.size();
        
            List<Integer> currentLevel = new ArrayList<>();
        
            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = que.poll();
        
                currentLevel.add(currentNode.val);
        
                if(currentNode.left != null) {
                    que.offer(currentNode.left);
                }
        
                if(currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }
        
            if(level % 2 == 1) {
                Collections.reverse(currentLevel);
            }
        
            result.add(currentLevel);
        
            level++;
        }

        return result;
    }
}