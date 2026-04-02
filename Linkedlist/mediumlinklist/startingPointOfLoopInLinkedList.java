
// //bruteforcesolution
// import java.util.*;

// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// class Solution {
//     public ListNode detectCycle(ListNode head) {
//         Set<ListNode> visited = new HashSet<>();
//         while (head != null) {
//             if (visited.contains(head)) {
//                 return head;
//             }
//             visited.add(head);
//             head = head.next;
//         }
//         return null;
//     }
// }

// public class startingPointOfLoopInLinkedList {
//     public static void main(String[] args) {
//         ListNode head = new ListNode(3);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(0);
//         head.next.next.next = new ListNode(-4);
//         head.next.next.next.next = head.next;

//         Solution obj = new Solution();
//         ListNode startNode = obj.detectCycle(head);

//         if (startNode != null)
//             System.out.println("Cycle starts at node with value: " + startNode.val);
//         else
//             System.out.println("No cycle found.");
//     }
// }

//tc: O(n)
//sc: O(n)

//optimal solution
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

public class startingPointOfLoopInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        Solution obj = new Solution();
        ListNode result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");
    }
}

// tc: O(n)
// sc: O(1)
