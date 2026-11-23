class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] convert = new long[nums.length];
        long max = 0;

        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            convert[i] = nums[i] + max;
        }

        for(int i = 1; i < convert.length; i++) {
            convert[i] += convert[i-1];
        }

        return convert;
    }
}