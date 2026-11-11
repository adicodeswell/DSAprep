class Solution {
    public int maxFreqSum(String s) {
        int v = 0;
        int co = 0;
        int freq[] = new int[26];
        int idx;
        for(char c: s.toCharArray()) {
            // c - 'a'; this will give us the index of char in freq arr
            idx = c - 'a';
            freq[idx]++;
        }

        for(int i = 0; i < 26; i++) {
            if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                if(freq[i] > v) {
                    v = freq[i];
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            if(i != 0 && i != 4 && i != 8 && i != 14 && i != 20) {
                if(freq[i] > co) {
                    co = freq[i];
                }
            }
        }

        return v + co;
    }
}