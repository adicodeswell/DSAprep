class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) {
                break;
            }
        } while(slow != fast);

        int a = slow;
        int b = 0;

        while(a!=b) {
            a = nums[a];
            b=nums[b];
        }

        return a;
    }
}