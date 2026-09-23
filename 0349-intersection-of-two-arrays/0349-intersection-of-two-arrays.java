class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int len = Math.max(nums1.length, nums2.length);

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }

        int[] ans = new int[set2.size()];

        int i = 0;
        for (int n : set2) {
            ans[i++] = n;
        }

        return ans;

    }
}