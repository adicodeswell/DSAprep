/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }

        Queue<Node> que = new LinkedList<>();

        que.offer(root);

        while(!que.isEmpty()) {
            int levelSize = que.size();

            for(int i = 0; i < levelSize; i++) {
                Node currentNode = que.poll();

                if(i==levelSize - 1) {
                    currentNode.next = null;
                } else {
                    currentNode.next = que.peek();
                }

                if(currentNode.left != null) {
                    que.offer(currentNode.left);
                }

                if(currentNode.right != null) {
                    que.offer(currentNode.right);
                }
            }

        }

        return root;
    }
}