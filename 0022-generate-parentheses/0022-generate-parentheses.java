class Solution {
    List<String> arr = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        solve(sb, 0,0,n);

        return arr;
    }

    public void solve(StringBuilder sb, int open, int close, int n) {
        if(open == n && close == n) {
            arr.add(sb.toString());
            return;
        }

        if(open < n) {
            sb.append("(");
            solve(sb, open+1, close, n);
            sb.deleteCharAt(sb.length() - 1);  // undo
        } 
        
        if(open > close) {
            sb.append(")");
            solve(sb, open, close+1, n);
            sb.deleteCharAt(sb.length() - 1);  // undo
        }

        return;
    }
}