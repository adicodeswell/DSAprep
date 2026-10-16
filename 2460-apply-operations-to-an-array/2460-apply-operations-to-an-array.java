class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] == nums[i]) {
                nums[i-1] *= 2;
                nums[i] = 0;
            }
        }

        // shifting 0's to the end
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }


        return nums;
    }
}