class Solution {
    public String[] assignUmbrella(int[] rain) {
        int aliceCount = 0;
        int bobCount = 0;
        String res[] = new String[rain.length];

        for(int i = 0; i < rain.length; i++) {
            if(i<rain.length-1 && rain[i] == 1 && rain[i+1] == 1 && (aliceCount <= bobCount)) {
                aliceCount++;
                res[i] = "Alice";
            } else if(rain[i] == 1) {
                bobCount++;
                res[i] = "Bob";
            } else {
                res[i] = "None";
            }
        }

        return res;
    }
}