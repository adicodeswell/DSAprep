class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        solve(1, k, comb, n);
        return ans;
    }

    public void solve(int index, int k, List<Integer> comb, int n) {
        if(comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }


        for(int i = index; i <= n; i++) {
            comb.add(i);
            solve(i+1, k, comb, n);
            comb.remove(comb.size() - 1);
        }

        return;
    }
}