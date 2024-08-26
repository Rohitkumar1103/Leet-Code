/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = null;
        ListNode ptr = head; 
        while(ptr != null){
            if(ptr.val == val){
                if(temp == null){
                    if(head.next == null){ 
                        return null;
                    } 
                head = head.next;
                ptr = head;
            } else if(ptr.next == null){
                temp.next = null;
                break;
            } else{
                ptr = ptr.next;
                temp.next = ptr;
            }
            }
            else{
                temp = ptr;
                ptr = temp.next;
            }
        }
        return head;
    }
}