class Solution {
    public String reversePrefix(String s, int k) {
        char res[] = s.toCharArray();

        int a = 0;
        int b = k-1;

        while(a<b) {
            char temp = res[a];
            res[a] = res[b];
            res[b] = temp;
            a++;
            b--;
        }

        return new String(res);
    }
}