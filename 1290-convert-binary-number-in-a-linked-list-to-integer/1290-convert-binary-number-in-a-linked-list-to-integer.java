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
    public int getDecimalValue(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            len++;
        }

        int num = 0;

        while(head != null) {
            num += head.val*Math.pow(2, len-1);
            head = head.next;
            len--;
        }

        return num;
    }
}