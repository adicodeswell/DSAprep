class Solution {
    public List<String> buildArray(int[] target, int n) {
        Arrays.sort(target);
        List<String> ans = new ArrayList<>();

        int j = 1;
        for(int i = 0; i < target.length; i++) {
            while(target[i] != j && j<n) {
                ans.add("Push");
                ans.add("Pop");
                j++;
            }
            if(target[i] == j) {
                ans.add("Push");
                j++;
            } 
            
        }

        return ans;
    }
}