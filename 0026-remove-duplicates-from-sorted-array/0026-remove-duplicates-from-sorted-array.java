class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int i = 1;
        while(i<nums.length) {
            if(nums[i] == nums[idx]) {
                i++;
            } else {
                nums[idx+1] = nums[i];
                idx++;
            }
        }

        return idx+1;
    }
}