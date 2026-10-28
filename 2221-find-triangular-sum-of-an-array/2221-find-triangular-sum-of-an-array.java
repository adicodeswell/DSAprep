
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        while (n > 1) {
            int i = 0;

            while (i < n - 1) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
                i++;
            }

            n--;
        }

        return nums[0];
    }
}
