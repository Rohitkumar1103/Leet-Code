/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 
 *     }
 * }
 */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if(head == null){
//             return null;
//         }
//         HashSet<ListNode> visited = new HashSet<>();
//         ListNode temp = head;
//         while(temp!=null){
//             if(visited.contains(temp)){
//                 return temp;
//             }
//             visited.add(temp);
//             temp = temp.next;
//         }
//     return null;
//     }
// }





public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
           }
        }
    return null;
    }
}