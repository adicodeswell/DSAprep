class Solution {
    public int minRange(int a, int b, int c) {
        int range = 0;
        int max = Math.max(a,b);
        max = Math.max(max, c);
        int min = Math.min(a,b);
        min = Math.min(min, c);

        int sum = a + b + c;
        sum = sum-max;

        if(sum > max) {
            return max - min;
        } else {
            return sum - min;
        }
    }
}