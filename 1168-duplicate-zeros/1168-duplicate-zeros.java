class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;
        int possibleDups = 0;
        int length = n - 1;

        // Find how many zeros can actually be duplicated
        for (int left = 0; left <= length - possibleDups; left++) {

            if (arr[left] == 0) {

                // This zero can only be copied once
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length--;
                    break;
                }

                possibleDups++;
            }
        }

        // Copy backwards
        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {

            if (arr[i] == 0) {

                arr[i + possibleDups] = 0;

                possibleDups--;

                arr[i + possibleDups] = 0;

            } else {

                arr[i + possibleDups] = arr[i];
            }
        }
    }
}