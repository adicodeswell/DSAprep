class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nsi = new int[heights.length];
        int[] psi = new int[heights.length];

        Arrays.fill(nsi, heights.length);
        Arrays.fill(psi, -1);
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < heights.length; i++) {
            while(!st.isEmpty() && heights[i] < heights[st.peek()]) {
                int idx = st.pop();
                nsi[idx] = i;
            }

            st.push(i);
        }

        st.clear();

        for(int i = 0; i < heights.length; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                psi[i] = st.peek();
            }

            st.push(i);
        }

        int max = 0;

        for(int i = 0; i < heights.length; i++) {
            int w = nsi[i] - psi[i] - 1;
            int area = w*heights[i];
            max = Math.max(max, area);
        }

        return max;
    }



    
}