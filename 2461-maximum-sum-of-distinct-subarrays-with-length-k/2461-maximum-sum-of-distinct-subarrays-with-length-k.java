class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long max = Integer.MIN_VALUE;
        while(j < nums.length) {
            if(!set.contains(nums[j])) {
                sum += nums[j];
                set.add(nums[j]);
                if(j-i+1 == k) {
                    max = Math.max(max, sum);
                    sum -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                j++;
            } else {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}