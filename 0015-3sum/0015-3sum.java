class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int comp = -(nums[i] + nums[j]);

                if (set.contains(comp)) {
                    List<Integer> triplet =
                        Arrays.asList(nums[i], comp, nums[j]);

                    Collections.sort(triplet);
                    res.add(triplet);
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(res);
    }
}