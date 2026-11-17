class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Find k largest elements
        for (int i = 0; i < nums.length; i++) {

            pq.offer(new int[]{nums[i], i});

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] selected = new int[k][2];

        for (int i = 0; i < k; i++) {
            selected[i] = pq.poll();
        }

        // Restore original order (this is important trick for this problem)
        Arrays.sort(selected, (a, b) -> Integer.compare(a[1], b[1]));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = selected[i][0];
        }

        return ans;
    }
}