class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(int j = 0; j < date.length(); j++) {
            if(date.charAt(j) == '-') {
                sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(i, j))));
                sb.append('-');
                i = j+1;
            } else if(j == date.length() - 1) {
                sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(i, j+1))));
            }
        }

        return sb.toString();
    }
}