class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(
                (long) arr[a[0]] * arr[b[1]],
                (long) arr[b[0]] * arr[a[1]]
            )
        );

        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        for (int count = 1; count < k; count++) {

            int[] curr = pq.poll();

            int i = curr[0];
            int j = curr[1];

            if (i + 1 < j) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        int[] ans = pq.peek();

        return new int[]{
            arr[ans[0]],
            arr[ans[1]]
        };
    }
}