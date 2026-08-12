class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());

        Collections.sort(freq);

        int ans = map.size();

        for (int num : freq) {
            if (k >= num) {
                k -= num;
                ans--;
            } else {
                break;
            }
        }

        return ans;
    }
}