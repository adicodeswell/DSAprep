class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp0 = 0;
        int dp1 = 0;

        for(int i = 2; i <= cost.length; i++) {
            int dpi = Math.min(dp0 + cost[i-2], dp1 + cost[i-1]);

            dp0 = dp1;
            dp1 = dpi;
        }

        return dp1;
    }
}