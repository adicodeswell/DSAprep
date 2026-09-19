class Solution {
    long memo[];
    public long mostPoints(int[][] questions) {
        memo = new long[questions.length + 1];
        Arrays.fill(memo, -1);
        return dp(0, questions);
    }


    public long dp(int index, int[][] questions) {
        if(index == questions.length - 1) {
            return questions[index][0];
        } else if(index > questions.length - 1) {
            return 0;
        }

        if(memo[index] != -1) {
            return memo[index];
        }

        long takeCurr = questions[index][0] + dp(index + questions[index][1] + 1,                                        questions);

        long skipCurr = dp(index + 1, questions);

        return memo[index] = Math.max(takeCurr, skipCurr);
    }
}