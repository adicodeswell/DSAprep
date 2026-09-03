class Solution {
    public int dominantIndex(int[] nums) {
        int idx = -1;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;
            } else if(nums[i] > max2) {
                max2 = nums[i];
            }
        }

        if((long) max2 * 2 <= max1) {
            return idx;
        }

        return -1;
    }
}