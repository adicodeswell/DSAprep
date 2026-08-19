class Solution {
    public int halveArray(int[] nums) {
        double sum = 0;
        double sumNew = 0;
        int k = 0;

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<nums.length; i++) {
            pq.offer((double)nums[i]);
            sum+=nums[i];
            sumNew+=nums[i];
        }

        while(sumNew > sum/2) {
            double a = pq.poll();
            a = a/2;
            sumNew -= a;
            pq.offer(a);
            k++;
        }

        return k;
    }
}