class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        while(j < nums.length) {
            sum += nums[j];

            if(j-i+1 == k) {
                maxAvg = Math.max(maxAvg, sum/k);
                sum-=nums[i];
                i++;
            }
            j++;
        }

        return maxAvg;
    }
}