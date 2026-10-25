class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int maxSum = 0;
        int sum = 0;

        while(j < nums.length) {

            while(set.contains(nums[j])) {
                // if next element is already in the set (not unique)
                // then we should shrink
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            sum += nums[j];
            set.add(nums[j]);
            maxSum = Math.max(maxSum, sum);
            j++;
        }

        return maxSum;
    }
}