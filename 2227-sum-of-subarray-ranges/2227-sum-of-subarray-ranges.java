class Solution {
    public long subArrayRanges(int[] arr) {

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Minimum - Left range
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Minimum - Right range
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {

                int idx = st.pop();

                right[idx] = i - idx;
            }

            st.push(i);
        }

        while(!st.isEmpty()) {

            int idx = st.pop();

            right[idx] = n - idx;
        }

        long sumMin = 0;

        for(int i = 0; i < n; i++) {
            sumMin += (long) arr[i] * left[i] * right[i];
        }

        st.clear();

        // Maximum - Left range
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Maximum - Right range
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                int idx = st.pop();

                right[idx] = i - idx;
            }

            st.push(i);
        }

        while(!st.isEmpty()) {

            int idx = st.pop();

            right[idx] = n - idx;
        }

        long sumMax = 0;

        for(int i = 0; i < n; i++) {
            sumMax += (long) arr[i] * left[i] * right[i];
        }

        return sumMax - sumMin;
    }
}