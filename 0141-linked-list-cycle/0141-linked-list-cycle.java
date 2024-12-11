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

 //HASHSET

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashSet<ListNode> visited = new HashSet<>();
//         ListNode temp = head;

//         while(temp != null){
//             if(visited.contains(temp)){
//                 return true;
//             }
//             visited.add(temp);
//             temp = temp.next;
//         }
//         return false;
//     }
// }


//USING TORTOISE & HARE

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
