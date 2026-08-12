class Solution {
    public String removeKdigits(String num, int k) {

        if (k == num.length()) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            int digit = num.charAt(i) - '0';

            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        String result = ans.reverse().toString();

        int i = 0;

        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }

        return result.substring(i);
    }
}