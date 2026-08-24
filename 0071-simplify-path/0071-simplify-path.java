class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(part);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String dir : s) {
            ans.append("/").append(dir);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}