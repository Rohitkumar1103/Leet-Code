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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        if (n == len) {
            return head.next;
        }
        temp = head;
        int delete = len - n;
        for(int i=1; i<delete; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}