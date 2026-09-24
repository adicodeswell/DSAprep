class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> path) {

        // Every node represents a valid subset
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            path.add(nums[i]);

            // Explore
            backtrack(i + 1, nums, path);

            // Undo
            path.remove(path.size() - 1);
        }
    }
}