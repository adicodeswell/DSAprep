class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack();
        Stack<Character> s2 = new Stack();

        for(char c: s.toCharArray()) {
            s1.push(c);
            if(s1.peek() == '#') {
                s1.pop();
                if(!s1.isEmpty()) s1.pop();
            }
        }

        for(char c: t.toCharArray()) {
            s2.push(c);
            if(s2.peek() == '#') {
                s2.pop();
                if(!s2.isEmpty()) s2.pop();
            }
        }

        if(s1.size() != s2.size()) return false;
        int siz = s1.size();

        for(int i = 0; i < siz; i++) {
            char a = s1.pop();
            char b = s2.pop();

            if(a != b) return false;
        }


        return true;
    }
}