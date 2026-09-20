class Solution {
    public int longestArithSeqLength(int[] arr) {

        int n = arr.length;

        HashMap<Integer, Integer>[] dp = new HashMap[n];

        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
        }

        int ans = 2;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                int diff = arr[i] - arr[j];

                if (dp[j].containsKey(diff)) {

                    int length = dp[j].get(diff) + 1;

                    dp[i].put(diff, length);

                } else {

                    dp[i].put(diff, 2);
                }

                ans = Math.max(ans, dp[i].get(diff));
            }
        }

        return ans;
    }
}