class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            ans[i] = prices[i];
        }

        for(int i = 0; i < prices.length; i++) {
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                int idx = st.pop();
                ans[idx] = prices[idx] - prices[i];
            }


            st.push(i);
        }

        return ans;

    }
}