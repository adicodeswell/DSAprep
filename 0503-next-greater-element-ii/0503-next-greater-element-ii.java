// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
        
//     }
// }

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        // Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < 2*nums.length; i++) {

            while(!stack.isEmpty() && nums[i%nums.length] > nums[stack.peek()]) {
                // map.put(stack.pop(), nums2[i]);
                int idx = stack.pop();
                ans[idx] = nums[i % nums.length];

            }

            stack.push(i%nums.length);
        }


        // for(int i = 0; i < nums1.length; i++) {
        //     ans[i] = map.getOrDefault(nums1[i], -1);
        // }

        return ans;
    }
}