class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(robFirst(nums), robLast(nums));
    }

    public int robFirst(int[] nums) {
        // state dp[i] -- amount robbed from 0 to i
        // state
        int dp0 = nums[0];
        int dp1 = Math.max(nums[1], nums[0]);

        for(int i = 2; i < nums.length - 1; i++) {
            int dpi = Math.max(dp0 + nums[i], dp1);
            dp0 = dp1;
            dp1 = dpi;
        }
        return dp1;
    }

    public int robLast(int[] nums) {
        int dp0 = nums[1];
        int dp1 = Math.max(nums[1], nums[2]);

        for(int i = 3; i < nums.length; i++) {
            int dpi = Math.max(dp0 + nums[i], dp1);
            dp0 = dp1;
            dp1 = dpi;
        }
        return dp1;
    }
}