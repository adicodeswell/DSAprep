class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < piles.length; i++) {
            pq.offer(piles[i]);
        }
        while(k>0) {
            int a = pq.poll();
            if(a%2 == 0) {
                a = a/2;
            } else {
                a -= a/2;
            }
            pq.offer(a);
            k--;
        }

        int stones = 0;
        while(!pq.isEmpty()) {
            stones += pq.poll();
        }

        return stones;
    } 
}