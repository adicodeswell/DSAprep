class Solution {
    public int climbStairs(int n) {
        int dp0 = 1; // one way to be at ground
        int dp1 = 1; // one way to be at the first stair

        for(int i = 2; i <= n; i++) {
            int x = dp0 + dp1;
            dp0 = dp1;
            dp1 = x;
        }

        return dp1; // I did dp1 = x that's why I am returning dp1 not x
    }
}