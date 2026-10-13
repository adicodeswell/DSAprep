class Solution {
    HashSet<String> set;
    public String findDifferentBinaryString(String[] nums) {
        set = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(String c: nums) {
            set.add(c);
        }

        return build(sb, nums[0].length());
    }

    public String build(StringBuilder sb, int n) {
    if (n == 0) {
        String current = sb.toString();

        if (!set.contains(current)) {
            return current;
        }

        return null;
    }

    sb.append("0");
    String a = build(sb, n - 1);
    sb.deleteCharAt(sb.length() - 1);

    if (a != null) {
        return a;
    }

    sb.append("1");
    String b = build(sb, n - 1);
    sb.deleteCharAt(sb.length() - 1);

    return b;
}
}