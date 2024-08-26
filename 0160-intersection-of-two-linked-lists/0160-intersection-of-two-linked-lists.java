/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            while (headA != null) {
            // Traverse listB
            ListNode tempB = headB;
            while (tempB != null) {
                // Check if the nodes are the same object
                if (headA == tempB) {
                    return headA; // Intersection node found
                }
                tempB = tempB.next; // Move to the next node in listB
            }
            headA = headA.next; // Move to the next node in listA
        }
        return null; // No intersection found
    
    }
}