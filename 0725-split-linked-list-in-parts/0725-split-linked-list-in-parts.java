
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;

        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        temp = head;
        ListNode[] ans = new ListNode[k];
        int idx = 0;
        int total = k;

        while (idx < total) {
            int part = len / k;
            if (len % k > 0) {
                part++;
            }

            ans[idx] = temp;
            ListNode dum = temp;

            for (int i = 0; i < part - 1 && dum != null; i++) {
                dum = dum.next;
            }

            if (dum != null) {
                temp = dum.next;
                dum.next = null;
            }

            len -= part;
            k--;
            idx++;
        }

        return ans;
    }
}
