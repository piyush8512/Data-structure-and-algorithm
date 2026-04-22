// // public class rotateaLinkedList {
    
// // }

// // Definition for singly-linked list node
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null || k == 0) return head;
//         for (int i = 0; i < k; i++) {
//             ListNode curr = head;
//             ListNode prev = null;
//             while (curr.next != null) {
//                 prev = curr;
//                 curr = curr.next;
//             }
//             prev.next = null;
//             curr.next = head;
//             head = curr;
//         }
//         return head;
//     }
// }

// // Driver class
// public class Main {
//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);
//         head.next.next.next = new ListNode(4);
//         head.next.next.next.next = new ListNode(5);

//         Solution sol = new Solution();
//         int k = 2;
//         ListNode result = sol.rotateRight(head, k);

//         // Print result
//         while (result != null) {
//             System.out.print(result.val + " ");
//             result = result.next;
//         }
//     }
// }

// //tc: O(n*k) where n is the number of nodes in the linked list and k is the number of rotations
// //sc: O(1) as we are using constant extra space for pointers


//optimal approach
// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        k = k % length;
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}

public class rotateaLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;
        Solution obj = new Solution();
        ListNode newHead = obj.rotateRight(head, k);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }
}


//tc: O(n) where n is the number of nodes in the linked list
//sc: O(1) as we are using constant extra space for pointers
