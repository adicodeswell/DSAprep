class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int i = 0;
        int j = 0;

        long sum = 0;
        long max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < nums.size()) {
            int num = nums.get(j);

            sum += num;
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (j - i + 1 == k) {
                if (map.size() >= m) {
                    max = Math.max(max, sum);
                }

                int left = nums.get(i);
                sum -= left;

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                i++;
            }

            j++;
        }

        return max;
    }
}