class Solution {
    public int sumOfSquareOfDigits(int n) {
        int sum = 0;

        while(n>0) {
            int dig = n%10;
            sum += dig * dig;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast!=1) {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(fast);
            fast = sumOfSquareOfDigits(fast);

            if(fast == 1) {
                return true;
            } else if(slow == fast) {
                return false;
            }
        }
        return true;
    }
}