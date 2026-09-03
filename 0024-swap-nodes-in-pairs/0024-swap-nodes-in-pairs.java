/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void swapHelper(ListNode p, ListNode cur) {
        if(cur == null || cur.next == null) {
            return;
        }
        ListNode f = cur,
                    s = cur.next;

            f.next = s.next;
            s.next = f;
            p.next = s;
        
        swapHelper(f, f.next);

    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        // while(head != null && head.next != null) {
        //     ListNode f = head,
        //             s = head.next;

        //     f.next = s.next;
        //     s.next = f;
        //     p.next = s;

        //     p = f;
        //     head = f.next;

        // }

        swapHelper(p, head);

        return dummy.next;
    }
}