class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sat = 0;
        for(int i = 0; i < customers.length; i++) {
            if(grumpy[i] == 0) {
                sat += customers[i];
            } 
        }

        int i = 0;
        int j = 0;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(j < customers.length) {
            if(grumpy[j] == 1) {
                sum += customers[j];
            }

            if(j-i+1 == minutes) {
                max = Math.max(max, sum);
                if(grumpy[i] == 1) {
                    sum -= customers[i];
                    i++;
                } else {
                    i++;
                }
            }
            j++;
        }

        return max + sat;
    }
}