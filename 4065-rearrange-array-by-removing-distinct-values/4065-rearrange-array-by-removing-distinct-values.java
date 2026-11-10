class Solution {
    public int[] rearrangeArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        while (idx < nums.length) {

            // This was given in the constraints 
            for (int num = 1; num <= 100; num++) {

                if (freq.containsKey(num) && freq.get(num) > 0) {

                    ans[idx++] = num;

                    freq.put(num, freq.get(num) - 1);
                }
            }
        }

        return ans;
    }
}