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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;

        while(second!=null) {
            int a = first.val;
            int b = second.val;
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            ListNode newnode = new ListNode(a);
            first.next = newnode;
            newnode.next = second;

            first = second;
            second = second.next;
        }

        return head;
    }
}