class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int rep = 0;
        int miss = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                rep = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }

        return new int[]{rep, miss};
    }
}