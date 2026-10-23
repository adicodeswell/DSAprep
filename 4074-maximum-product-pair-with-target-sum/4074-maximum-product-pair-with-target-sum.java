class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int maxProd = Integer.MIN_VALUE;
        int res[] = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && (nums[i] + nums[j] == target) && i!=j) {
                    if(nums[i] * nums[j] > maxProd) {
                        maxProd = nums[i] * nums[j];
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
        }
        if(maxProd == Integer.MIN_VALUE)
            return new int[] {-1, -1};

        return res;
    }
}