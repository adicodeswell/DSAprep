class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int n: nums) {
            max = Math.max(n, max);
        }

        int i = 0;
        int j = 0;
        int count = 0;
        long ans = 0;

        while(j < nums.length) {
            if(nums[j] == max)
                count++;

            while(count >= k) {
                ans+=nums.length - j;
                // remove the element from the left
                if(nums[i] == max) 
                    count--;
                i++;
            }
            j++;
        }
        return ans;
    }
}