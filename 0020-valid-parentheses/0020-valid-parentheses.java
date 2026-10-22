class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sc.push(')');
            } else if (c == '{') {
                sc.push('}');
            } else if (c == '[') {
                sc.push(']');
            } else {
                // If it's a closing bracket, the stack must not be empty 
                // and the top element must match the current closing bracket
                if (sc.isEmpty() || sc.pop() != c) {
                    return false;
                }
            }
        }
        
        // If the stack is completely empty, all brackets were matched correctly
        return sc.isEmpty();
    }
}
