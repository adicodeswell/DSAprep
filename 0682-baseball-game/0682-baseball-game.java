class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> sc = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int a = sc.pop();
                int b = sc.peek();

                sc.push(a);
                sc.push(a + b);

            } else if (s.equals("D")) {
                sc.push(2 * sc.peek());

            } else if (s.equals("C")) {
                sc.pop();

            } else {
                sc.push(Integer.parseInt(s));
            }
        }

        int score = 0;

        while (!sc.isEmpty()) {
            score += sc.pop();
        }

        return score;
    }
}