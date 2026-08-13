class Solution {
    public String reorganizeString(String s) {

        // 1. Count frequency
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 2. Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        for (char c : map.keySet()) {
            pq.offer(c);
        }

        StringBuilder sb = new StringBuilder();

        // 3. Always take the two most frequent characters
        while (pq.size() >= 2) {

            char first = pq.poll();
            char second = pq.poll();

            sb.append(first);
            sb.append(second);

            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);

            if (map.get(first) > 0) {
                pq.offer(first);
            }

            if (map.get(second) > 0) {
                pq.offer(second);
            }
        }

        // 4. One character left
        if (!pq.isEmpty()) {
            char last = pq.poll();

            if (map.get(last) > 1) {
                return "";
            }

            sb.append(last);
        }

        return sb.toString();
    }
}