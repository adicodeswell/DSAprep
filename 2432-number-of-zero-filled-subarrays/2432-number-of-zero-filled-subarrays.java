class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        long res = 0;
        while(i < nums.length) {
            int count = 0;
            while(i  < nums.length && nums[i] == 0) {
                count++;
                i++;
            }
            res+=sumOneToN(count);
            i++;
        }

        return res;
    }

    public long sumOneToN(long n) {
        return n*(n+1)/2;
    }
}