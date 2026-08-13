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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        while(!que.isEmpty()) {
            int levelSize = que.size();

            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i = 0; i<levelSize; i++) {
                TreeNode currentNode = que.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null) {
                    que.offer(currentNode.left);
                }

                if(currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }

            result.add(currentLevel);
            
        }

        return result;
    }
}