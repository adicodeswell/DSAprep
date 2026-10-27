class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        int idx = 0;
        int found = 0;

        for(char c: word.toCharArray()) {
            if(c != ch) {
                s.push(c);
                idx++;
            } else if(c == ch) {
                s.push(c);
                found = 1;
                idx++;
                break;
            }
        }

        if(found == 1) {
            while(!s.isEmpty()) {
                sb.append(s.pop());
            }

            for(int i = idx; i < word.length(); i++) {
                sb.append(word.charAt(i));
            }
        } else {
            return word;
        }

        

        return sb.toString();

    }
}