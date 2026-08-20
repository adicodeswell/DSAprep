class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int n = matrix.length;

        // First element from every row
        for (int row = 0; row < n; row++) {
            pq.offer(new int[]{matrix[row][0], row, 0});
        }

        // Find the kth smallest
        for (int i = 0; i < k - 1; i++) {

            int[] current = pq.poll();

            int row = current[1];
            int col = current[2];

            // Next element from the same row
            if (col + 1 < n) {
                pq.offer(new int[]{
                    matrix[row][col + 1],
                    row,
                    col + 1
                });
            }
        }

        return pq.peek()[0];
    }
}