class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] last = new int[26];

        // Store last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Current partition must extend at least
            // until the last occurrence of this character
            end = Math.max(end, last[s.charAt(i) - 'a']);

            // All characters in the partition are now complete
            if (i == end) {
                ans.add(end - start + 1);
                start = i + 1;
            }
        }

        return ans;
    }
}