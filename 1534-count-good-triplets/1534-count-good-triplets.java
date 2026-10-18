class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    if(a >= Math.abs(arr[i] - arr[j]) && b>= Math.abs(arr[j] - arr[k]) && c>= Math.abs(arr[i] - arr[k])) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}