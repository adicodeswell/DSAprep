class Solution {
    List<String> ans;
    public List<String> validStrings(int n) {
        ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(n, 1, 0, sb);
        return ans;
    }

    public void solve(int n, int last, int idx, StringBuilder sb) {
        if(idx == n) {
            ans.add(sb.toString());
            return;
        }

        if(last == 0) {
            sb.append('1');
            solve(n, 1, idx+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append('0');
            solve(n, 0, idx+1, sb);
            sb.deleteCharAt(sb.length() - 1);
            sb.append('1');
            solve(n, 1, idx+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}