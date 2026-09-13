class Solution {
    public boolean check(int[] nums) {
        int decreaseCount = 0;

        for(int i = 1; i < 2 * nums.length; i++) {
            if(nums[i%nums.length] < nums[(i-1)%nums.length]) 
                decreaseCount++;
        }

        if(decreaseCount == 0 || decreaseCount == 1 || decreaseCount == 2) 
            return true;
        return false;
    }
}