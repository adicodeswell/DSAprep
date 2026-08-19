class Solution {
    public int maximumProduct(int[] nums, int k) {
        long MOD = 1000000007L;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }

        while(k>0) {
            int a = pq.poll();
            a++;
            pq.offer(a);
            k--;
        }
        long product = 1;

        while (!pq.isEmpty()) {
            product = (product * pq.poll()) % MOD;
        }

        return (int) product;

    }
}