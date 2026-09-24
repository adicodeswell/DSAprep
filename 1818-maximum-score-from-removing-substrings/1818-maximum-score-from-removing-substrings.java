class Solution {
    public int maximumGain(String s, int x, int y) {

        Stack<Character> stack = new Stack<>();
        int ans = 0;

        boolean abFirst = x > y;

        // First remove the higher-value pair
        if (abFirst) {

            // Remove "ab"
            for (char c : s.toCharArray()) {

                if (!stack.isEmpty() && stack.peek() == 'a' && c == 'b') {
                    stack.pop();
                    ans += x;
                } else {
                    stack.push(c);
                }
            }

            // Now remove "ba"
            s = "";

            while (!stack.isEmpty()) {
                s += stack.pop();
            }

            stack.clear();

            for (int i = s.length() - 1; i >= 0; i--) {

                char c = s.charAt(i);

                if (!stack.isEmpty() && stack.peek() == 'b' && c == 'a') {
                    stack.pop();
                    ans += y;
                } else {
                    stack.push(c);
                }
            }

        } else {

            // Remove "ba"
            for (char c : s.toCharArray()) {

                if (!stack.isEmpty() && stack.peek() == 'b' && c == 'a') {
                    stack.pop();
                    ans += y;
                } else {
                    stack.push(c);
                }
            }

            // Now remove "ab"
            s = "";

            while (!stack.isEmpty()) {
                s += stack.pop();
            }

            stack.clear();

            for (int i = s.length() - 1; i >= 0; i--) {

                char c = s.charAt(i);

                if (!stack.isEmpty() && stack.peek() == 'a' && c == 'b') {
                    stack.pop();
                    ans += x;
                } else {
                    stack.push(c);
                }
            }
        }

        return ans;
    }
}