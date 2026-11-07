class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode prev = dummy;

        int carry = 0;
        int a = 0;
        int b = 0;

        while(l1 != null || l2 != null) {
            if(l1 != null) {
                a = l1.val;
            } else {
                a = 0;
            }

            if(l2 != null) {
                b = l2.val;
            } else {
                b = 0;
            }

            if(a + b + carry < 10) {
                l1.val = a + b + carry;
                carry = 0;
            } else {
                l1.val = (a + b + carry) % 10;
                carry = (a + b + carry) / 10;
            }

            if(l1 != null) {
                prev = l1;
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }

            if(l1 == null && l2 != null) {
                prev.next = new ListNode(0);
                l1 = prev.next;
            }
        }

        if(carry != 0) {
            prev.next = new ListNode(carry);
        }

        return dummy.next;
    }
}