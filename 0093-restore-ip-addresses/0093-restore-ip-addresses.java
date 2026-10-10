
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        restore(s, 0, 0, sb, res);

        return res;
    }

    private void restore(String s, int pos, int segments,
                         StringBuilder sb, List<String> res) {

        if (segments == 4) {
            if (pos == s.length()) {
                res.add(sb.substring(0, sb.length() - 1));
            }
            return;
        }

        for (int len = 1; len <= 3 && pos + len <= s.length(); len++) {

            String part = s.substring(pos, pos + len);

            if (len > 1 && part.charAt(0) == '0') {
                break;
            }

            int num = Integer.parseInt(part);

            if (num > 255) {
                break;
            }

            int oldLength = sb.length();

            sb.append(part).append('.');

            restore(s, pos + len, segments + 1, sb, res);

            sb.setLength(oldLength);
        }
    }
}
