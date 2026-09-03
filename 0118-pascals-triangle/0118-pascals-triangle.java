class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        // numsRow = 5
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);

        for(int row = 1; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);
            List<Integer> prevRow = res.get(row-1); 

            for(int i = 1; i < row; i++) {
                newRow.add(prevRow.get(i) + prevRow.get(i-1));
            }
            newRow.add(1);
            res.add(newRow);
        }
        return res;
    }
}