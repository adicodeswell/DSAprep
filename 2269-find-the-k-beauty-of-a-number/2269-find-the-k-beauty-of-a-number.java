class Solution {
    public int divisorSubstrings(int num, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(num);
        int n = 0;

        while( j < str.length()) {
            sb.append(str.charAt(j));
            if(j-i+1 == k) {
                n = Integer.parseInt(sb.toString());
                if(n!=0 && num%n == 0) {
                    count++;
                }
                sb.deleteCharAt(0);
                i++;
            }
            j++;
        }

        return count;
    }
}