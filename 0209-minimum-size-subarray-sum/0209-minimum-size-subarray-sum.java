class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;

        int sum = 0;
        int win = Integer.MAX_VALUE;

        while(j < nums.length) {
            sum += nums[j];
            // while loop here shrink while invalid
            while(sum >= target) {
                win = Math.min(win, j-i+1);
                sum -= nums[i];
                i++;
            } 
            j++;
        }

        return win == Integer.MAX_VALUE ? 0 : win;
    }
}