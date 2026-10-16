class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> pos = new ArrayList<>();
        int[] res = new int[boxes.length()];

        for(int i = 0; i < boxes.length(); i++) {
            if(boxes.charAt(i) == '1') {
                pos.add(i);
            }
        }
        for(int i = 0; i < boxes.length(); i++) {
            for(int a: pos) {
                res[i] += Math.abs(a - i);
            }
        }

        return res;


    }
}