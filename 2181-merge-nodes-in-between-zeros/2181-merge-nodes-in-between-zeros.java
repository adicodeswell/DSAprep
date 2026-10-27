class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode write = head;
        ListNode read = head.next;

        int sum = 0;

        while (read != null) {
            if (read.val != 0) {
                sum += read.val;
            } else {
                write = write.next;
                write.val = sum;
                sum = 0;
                read = read.next;
                write.next = read;
                continue;
            }

            read = read.next;
        }

        return head.next;
    }
}