class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int n: nums) {
            if(n%3 == 1) {
                count++;
            } else if(n%3 == 2) {
                count++;
            }
        }

        return count;
    }
}