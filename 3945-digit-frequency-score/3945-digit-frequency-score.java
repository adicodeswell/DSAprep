class Solution {
    public int digitFrequencyScore(int n) {
        int res = 0;
        while(n > 0) {
            int last = n%10;
            res += last;
            n/=10;
        }

        return res;
    }
}