class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodLeft[] = new int[nums.length];
        int prodRight[] = new int[nums.length];
        prodLeft[0] = 1;
        prodRight[nums.length - 1] = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            prodLeft[i+1] = prodLeft[i]*nums[i];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            prodRight[i] = prodRight[i+1]*nums[i+1];
        }

        int res[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = prodLeft[i]*prodRight[i];
        }

        return res;
    }
}