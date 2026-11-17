class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2) {
            return nums[0];
        }
        int dp0 = nums[0];
        int dp1 = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            int dpi = Math.max(dp0 + nums[i], dp1);
            dp0 = dp1;
            dp1 = dpi;
        }

        return dp1;
    }
}