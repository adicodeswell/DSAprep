class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int n: nums) {
            totalSum += n;
        }

        int leftSum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]) {
                return i;
            } else {
                leftSum += nums[i];
            }
        }

        return -1;
    }
}