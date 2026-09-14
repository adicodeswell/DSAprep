class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> cache = new HashMap<>();

    public int f(int n, Map<Integer, Integer> map) {
        if(cache.containsKey(n)) return cache.get(n);
        if(n == 0) return 0;
        if(n == 1) return map.getOrDefault(1, 0);


        cache.put(n, Math.max(map.getOrDefault(n, 0) + f(n-2, map), f(n-1, map)));

        return cache.get(n);
    }
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for(int n: nums) {
            max = Math.max(n, max);
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + n);
            } else {
                map.put(n, n);
            }
        }

        return f(max, map);
    }
}