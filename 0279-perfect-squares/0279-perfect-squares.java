class Solution {
    int cache[];
    public int numSquares(int n) {
        cache = new int[n + 1];
        Arrays.fill(cache, -1);
        return dp(n);
    }

    public int dp(int n) {
        if(n == 0) return 0;

        if(cache[n] != -1) return cache[n];

        cache[n] = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; i++) {
            cache[n] = Math.min(cache[n], dp(n - (i*i)) + 1);
        }

        return cache[n];

    }
}