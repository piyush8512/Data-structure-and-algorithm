// // // public class add1toanumberrepresentedbyLL {

// // // }

// // // Node class representing a single digit in the linked list
// // class Node {
// //     int data;
// //     Node next;

// //     Node(int value) {
// //         data = value;
// //         next = null;
// //     }
// // }

// // class LinkedList {
// //     Node append(Node head, int value) {
// //         Node newNode = new Node(value);
// //         if (head == null) {
// //             return newNode;
// //         }
// //         Node current = head;
// //         while (current.next != null)
// //             current = current.next;
// //         current.next = newNode;
// //         return head;
// //     }
// //     void printList(Node head) {
// //         Node current = head;
// //         while (current != null) {
// //             System.out.print(current.data);
// //             current = current.next;
// //         }
// //         System.out.println();
// //     }
// // }

// // // Solution class having the addOne logic 
// // class Solution {
// //     Node reverseList(Node node) {
// //         Node prev = null;
// //         Node current = node;

// //         while (current != null) {
// //             Node nextNode = current.next;
// //             current.next = prev;
// //             prev = current;
// //             current = nextNode;
// //         }
// //         return prev;
// //     }

// //     Node addOne(Node head) {
// //         head = reverseList(head);
// //         Node current = head;
// //         int carry = 1; 
// //         while (current != null && carry > 0) {
// //             int sum = current.data + carry;
// //             current.data = sum % 10;
// //             carry = sum / 10;
// //             if (current.next == null && carry > 0) {
// //                 current.next = new Node(carry);
// //                 carry = 0;  
// //             }
// //             current = current.next;
// //         }
// //         head = reverseList(head);
// //         return head;
// //     }
// // }

// // public class add1toanumberrepresentedbyLL {
// //     public static void main(String[] args) {
// //         Node head = null;
// //         LinkedList ll = new LinkedList();
// //         Solution sol = new Solution();
// //         head = ll.append(head, 1);
// //         head = ll.append(head, 2);
// //         head = ll.append(head, 9);

// //         System.out.print("Original Number: ");
// //         ll.printList(head);

// //         head = sol.addOne(head);
// //         System.out.print("After Adding One: ");
// //         ll.printList(head);
// //     }
// // }

// // // tc   O(n) where n is the number of nodes in the linked list, as we need to traverse the list to reverse it, add one, and reverse it back.
// // // sc   O(1) as we are modifying the linked list in place without using any

// class Node {
//     int data;
//     Node next;

//     Node(int value) {
//         data = value;
//         next = null;
//     }
// }

// class LinkedList {
//     Node append(Node head, int value) {
//         Node newNode = new Node(value);
//         if (head == null) {
//             return newNode;
//         }
//         Node current = head;
//         while (current.next != null)
//             current = current.next;
//         current.next = newNode;
//         return head;
//     }

//     void printList(Node head) {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data);
//             current = current.next;
//         }
//         System.out.println();
//     }
// }

// class Solution {
//     int addOneUtil(Node node) {
//         if (node == null)
//             return 1;
//         int carry = addOneUtil(node.next);
//         int sum = node.data + carry;
//         node.data = sum % 10;
//         return sum / 10;
//     }

//     Node addOne(Node head) {
//         int carry = addOneUtil(head);
//         if (carry != 0) {
//             Node newHead = new Node(carry);
//             newHead.next = head;
//             head = newHead;
//         }
//         return head;
//     }
// }

// public class add1toanumberrepresentedbyLL {
//     public static void main(String[] args) {
//         Node head = null;
//         LinkedList ll = new LinkedList();
//         Solution sol = new Solution();
//         head = ll.append(head, 1);
//         head = ll.append(head, 2);
//         head = ll.append(head, 9);

//         System.out.print("Original Number: ");
//         ll.printList(head);

//         head = sol.addOne(head);

//         System.out.print("After Adding One: ");
//         ll.printList(head);
//     }
// }



// tc   O(n) where n is the number of nodes in the linked list, as we need to traverse the list once to add one.
// sc   O(n) in the worst case when all digits are 9 and we need
