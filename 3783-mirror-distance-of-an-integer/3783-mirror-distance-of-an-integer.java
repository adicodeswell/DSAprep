class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int org = n;
        while(n>0) {
            int last = n%10;
            rev = rev*10 + last;
            n = n/10;
        }

        return Math.abs(org - rev);
    }
}