
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }

        // GCD using Euclidean algorithm
        while (sumEven != 0) {
            int temp = sumEven;
            sumEven = sumOdd % sumEven;
            sumOdd = temp;
        }

        return sumOdd;
    }
}
