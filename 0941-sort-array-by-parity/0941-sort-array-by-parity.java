class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;

        for(int n: nums) {
            if(n%2 == 0) {
                res[i] = n;
                i++;
            }
        }

        for(int n: nums) {
            if(n%2 != 0) {
                res[i] = n;
                i++;
            }
        }

        return res;
    }
}