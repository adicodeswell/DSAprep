class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int zeros = 0;
        int maxLen = Integer.MIN_VALUE;

        while(j < nums.length) {
            while(zeros == 1 && nums[j] == 0) {
                // if we already have a zero and one more zero is comming
                // shrink
                if(nums[i] == 0)
                    zeros--;
                i++;
            }
            if(nums[j] == 0)
                zeros++;
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }

        return maxLen-1;
    }
}