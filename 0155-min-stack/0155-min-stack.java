class Node {
    int val;
    int min;

    public Node(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<Node>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new Node(val, val));
            return;
        }

        Node nodeTop = stack.peek();
        int minTop = nodeTop.min;

        if(val < minTop) {
            stack.push(new Node(val, val));
        } else {
            stack.push(new Node(val, minTop));
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) {
            return;
        }

        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty()) {
            return -1;
        }

        Node nodeTop = stack.peek();
        return nodeTop.val;
    }
    
    public int getMin() {
        if(stack.isEmpty()) {
            return -1;
        }

        Node nodeTop = stack.peek();
        return nodeTop.min;
    }
}