class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int comp = -(nums[i] + nums[j]);

                if (set.contains(comp)) {
                    res.add(Arrays.asList(nums[i], nums[j], comp));
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(res);
    }
}