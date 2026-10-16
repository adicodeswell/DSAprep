class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[] = new int[nums.length * 2];

        for(int i = 0; i< nums.length; i++) {
            res[i] = nums[i];
        }
        int j = nums.length;
        for(int i = nums.length - 1; i >= 0; i--) {
            res[j] = nums[i];
            j++;
        }

        return res;
    }
}