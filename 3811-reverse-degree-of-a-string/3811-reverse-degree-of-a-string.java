        
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 1; i <= s.length(); i++) {
            int a = s.charAt(i-1) - 'a';
            int b = 26 - a;
            int c = b*i;
            ans+=c;
        }
        // for(char c: s.toCharArray()) {
        //     a = c - 'a'; // a = 0(c - 'a' + 1) * 2
        //     int b = 26 - a;
        // }

        return ans;
    }
}