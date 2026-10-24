class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;

        int totalSum = 0;
        for (int x : cardPoints) {
            totalSum += x;
        }

        if (windowSize == 0) {
            return totalSum;
        }

        int i = 0, j = 0;
        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        while (j < n) {
            windowSum += cardPoints[j];

            if (j - i + 1 == windowSize) {
                minSum = Math.min(minSum, windowSum);
                windowSum -= cardPoints[i];
                i++;
            }

            j++;
        }

        return totalSum - minSum;
    }
}