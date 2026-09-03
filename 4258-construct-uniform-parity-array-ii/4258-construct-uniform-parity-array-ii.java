class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallestOdd = Integer.MAX_VALUE;
        int flagOdd = 0;
        for(int n:nums1) {
            if(n%2 != 0) {
                flagOdd = 1;
                smallestOdd = Math.min(n,smallestOdd);
            }
        }

        if(flagOdd != 1) {
            return true;
        }

        for(int n : nums1) {
            if((n%2 == 0) && (n-smallestOdd < 1)) 
                return false;
        }

        return true;
        
    }
}