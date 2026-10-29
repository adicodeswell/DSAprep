class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                if (ans.size() <= i) {
                    ans.add(new ArrayList<>());
                }

                ans.get(i).add(num);
            }
        }

        return ans;

    }
}