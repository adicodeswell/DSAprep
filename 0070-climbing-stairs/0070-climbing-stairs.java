class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(map.containsKey(n)) {
            return map.get(n);
        }
        if(n == 0) {
            return 1;
        } else if(n == -1) {
            return 0;
        }

        int res = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, res);
        return res;
    }

}