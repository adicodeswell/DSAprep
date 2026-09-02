class Solution {

    public int calcNextInd(int[] nums, int cur) {
        int next = cur;

        int seq = nums[cur];

        if (seq > 0) {
            next = (next + seq) % nums.length;
        } else {
            int mod = seq % nums.length;
            int forward = nums.length + mod;
            next = (cur + forward) % nums.length;
        }

        return next;
    }

    public boolean circularArrayLoop(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            Set<Integer> set = new HashSet<>();
            set.add(i);

            boolean isPos = nums[i] > 0;

            int cur = i;

            while (true) {

                int next = calcNextInd(nums, cur);

                if (isPos) {

                    if (nums[next] < 0) {
                        break;
                    } else {

                        if (set.contains(next)) {

                            // Cycle should have length > 1
                            if (cur != next) {
                                return true;
                            }

                            // Self loop
                            break;
                        }

                        set.add(next);
                    }

                } else {

                    if (nums[next] > 0) {
                        break;
                    } else {

                        if (set.contains(next)) {

                            // Cycle should have length > 1
                            if (cur != next) {
                                return true;
                            }

                            // Self loop
                            break;
                        }

                        set.add(next);
                    }
                }

                cur = next;
            }
        }

        return false;
    }
}