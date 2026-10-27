class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int list[] = new int[nums.length];
        int ans[] = new int[2];
        int idx=0;

        for(int i = 0; i < nums.length; i++) {
            if(list[nums[i]] == 1) {
                ans[idx] = nums[i];
                idx++;
            }
            list[nums[i]]++;
        }

        return ans;
    }
}