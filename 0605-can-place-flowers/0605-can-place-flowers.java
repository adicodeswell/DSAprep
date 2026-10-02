class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            int last = 0;
            int next = 0;

            if (i > 0) {
                last = flowerbed[i - 1];
            }

            if (i < flowerbed.length - 1) {
                next = flowerbed[i + 1];
            }

            if (last == 0 && flowerbed[i] == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if (n <= 0) {
                return true;
            }
        }

        return false;
    }
}