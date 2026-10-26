class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        map.put(0, 1);

        int prefix = 0;

        for (int num : nums) {
        
            prefix += num;

            if (map.containsKey(prefix - k)) {
            
                count += map.get(prefix - k);

            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
                return count;
    }
}