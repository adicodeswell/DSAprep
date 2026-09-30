class Solution {
    Boolean[][] memo;
    HashMap<Integer, Integer> map;

    public boolean canCross(int[] stones) {
        int n = stones.length;

        memo = new Boolean[n][n];
        map = new HashMap<>();

        // position -> index
        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        return solve(0, 0, stones);
    }

    private boolean solve(int curr, int jump, int[] stones) {

        // Reached the last stone
        if (curr == stones.length - 1)
            return true;

        // Already calculated
        if (memo[curr][jump] != null)
            return memo[curr][jump];

        for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {

            if (nextJump <= 0)
                continue;

            // Current position + jump distance
            int targetPosition = stones[curr] + nextJump;

            // Check if a stone exists at targetPosition
            if (map.containsKey(targetPosition)) {

                int nextIndex = map.get(targetPosition);

                if (solve(nextIndex, nextJump, stones)) {
                    return memo[curr][jump] = true;
                }
            }
        }

        return memo[curr][jump] = false;
    }
}