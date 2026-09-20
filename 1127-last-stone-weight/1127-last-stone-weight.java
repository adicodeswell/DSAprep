class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones) {
            pq.add(stone);
        }

        while(pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            int diff = Math.abs(a-b);

            pq.add(diff);
        }

        return pq.poll();
    }
}