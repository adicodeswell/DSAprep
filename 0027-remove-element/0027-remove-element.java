class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int i = 0;

        while (i <= end) {
            if (nums[i] == val) {
                nums[i] = nums[end];
                end--;
            } else {
                i++;
            }
        }

        return end + 1;
    }
}