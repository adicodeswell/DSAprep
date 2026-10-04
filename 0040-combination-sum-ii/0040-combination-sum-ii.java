class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();

        Arrays.sort(candidates);

        List<Integer> comb = new ArrayList<>();

        solve(0, target, comb, candidates);

        return ans;
    }

    public void solve(int index, int target, List<Integer> comb, int[] candidates) {

        if(target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for(int i = index; i < candidates.length; i++) {

            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i] > target) {
                break;
            }

            comb.add(candidates[i]);

            solve(i + 1, target - candidates[i], comb, candidates);

            comb.remove(comb.size() - 1);
        }
    }
}