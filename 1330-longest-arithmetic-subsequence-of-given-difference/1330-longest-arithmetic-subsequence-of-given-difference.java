class Solution {
    public int longestSubsequence(int[] arr, int difference) {

        HashMap<Integer, Integer> dp = new HashMap<>();

        int ans = 0;
        for(int n: arr) {
            int prev = n - difference;
            int length = dp.getOrDefault(prev, 0) + 1;
            dp.put(n, length);
            ans = Math.max(ans, length);
        }
        return ans;
    }
}