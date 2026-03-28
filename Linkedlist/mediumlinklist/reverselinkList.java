// // // Definition for singly-linked list node

// //brute force approach
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

//     public ListNode reverseList(ListNode head) {
//         Stack<Integer> stack = new Stack<>();
//         ListNode temp = head;
//         while (temp != null) {
//             stack.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         while (temp != null) {
//             temp.val = stack.pop();
//             temp = temp.next;
//         }
//         return head;
//     }
// }

// // Driver code
// public class reverselinkList { 
//     public static void main(String[] args) {
//         ListNode head = new ListNode(1);
//         head.next = new ListNode(2);
//         head.next.next = new ListNode(3);

//         Solution sol = new Solution();
//         head = sol.reverseList(head);

//         while (head != null) {
//             System.out.print(head.val + " ");
//             head = head.next;
//         }
//     }
// }

// //o(n) time complexity and o(n) space complexity






// // class ListNode {
// //     int val;
// //     ListNode next;

// //     ListNode(int val) {
// //         this.val = val;
// //         this.next = null;
// //     }
// // }

// // class Solution {
// //     public ListNode reverseList(ListNode head) {
// //         ListNode prev = null;
// //         ListNode temp = head;
// //         while (temp != null) {
// //             ListNode front = temp.next;
// //             temp.next = prev;
// //             prev = temp;
// //             temp = front;
// //         }
// //         return prev;
// //     }
// // }

// // public class reverselinkList {
// //     public static void main(String[] args) {
// //         ListNode head = new ListNode(1);
// //         head.next = new ListNode(2);
// //         head.next.next = new ListNode(3);
// //         head.next.next.next = new ListNode(4);
// //         head.next.next.next.next = new ListNode(5);

// //         Solution sol = new Solution();
// //         ListNode newHead = sol.reverseList(head);
// //         while (newHead != null) {
// //             System.out.print(newHead.val + " ");
// //             newHead = newHead.next;
// //         }
// //         System.out.println();
// //     }
// // }

// //o(n) time complexity and o(1) space complexity





//recursive approach
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

class Solution {
        public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}

// Driver code
public class reverselinkList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        // Printing reversed list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
        System.out.println();
    }
}



//o(n) time complexity and o(n) space complexity due to recursive stack space