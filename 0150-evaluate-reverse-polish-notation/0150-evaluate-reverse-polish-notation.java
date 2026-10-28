class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>(); 
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        Stack<Integer> st = new Stack<>();

        for(String n : tokens) {

            if(set.contains(n)) {

                int a = st.pop();
                int b = st.pop();

                int ans = 0;

                if(n.equals("+")) {
                    ans = b + a;
                }
                else if(n.equals("-")) {
                    ans = b - a;
                }
                else if(n.equals("*")) {
                    ans = b * a;
                }
                else if(n.equals("/")) {
                    ans = b / a;
                }

                st.push(ans);

            } else {
                st.push(Integer.parseInt(n));
            }
        }

        return st.pop();
    }
}