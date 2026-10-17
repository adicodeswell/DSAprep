class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int bits = 0;
            int num = i;

            while (num > 0) {
                int last = num % 2;

                if (last != 0) {
                    bits++;
                }

                num /= 2;
            }

            res[i] = bits;
        }

        return res;
    }
}