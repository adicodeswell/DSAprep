class Solution {
    public int numberOfBeams(String[] bank) {
        int last = 0;
        int cur = 0;
        int ans = 0;

        for(String s: bank) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') {
                    cur++;
                }
            }
            if(cur != 0) {
                ans += cur*last;
                last = cur;
            }
                
            cur = 0;
        }

        return ans;
    }
}