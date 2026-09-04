class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> n = new Stack<>();

        int count = 0;
        String s1 = new String();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c >= '0' && c<='9') {
                count = 10 * count + (c - '0');
            } else if(c == '[') {
                st.push(s1);
                n.push(count);
                s1 = "";
                count = 0;
            } else if(c == ']') {
                String s2 = st.pop();
                int num = n.pop();

                StringBuilder res = new StringBuilder();
                res.append(s2);
                for(int j = 0; j < num; j++) {
                    res.append(s1);
                }
                s1 = res.toString();
            } else {
                s1 = s1 + Character.toString(c);
            }
        }

        return s1;
    }
}