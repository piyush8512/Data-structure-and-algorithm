// // // // public class findintersectionofTwoLinkedLists {

// // // // }

// // // class Node {
// // // int num;
// // // Node next;
// // // Node(int val) {
// // // num = val;
// // // next = null;
// // // }
// // // }

// // // class Solution {
// // // public void insertNode(Node head, int val) {
// // // Node newNode = new Node(val);
// // // if (head == null) {
// // // head = newNode;
// // // return;
// // // }
// // // Node temp = head;
// // // while (temp.next != null) {
// // // temp = temp.next;
// // // }
// // // temp.next = newNode;
// // // }

// // // public Node intersectionPresent(Node head1, Node head2) {
// // // while (head2 != null) {
// // // Node temp = head1;
// // // while (temp != null) {
// // // if (temp == head2) return head2;
// // // temp = temp.next;
// // // }
// // // head2 = head2.next;
// // // }
// // // return null;
// // // }
// // // public void printList(Node head) {
// // // while (head != null && head.next != null) {
// // // System.out.print(head.num + "->");
// // // head = head.next;
// // // }
// // // if (head != null) {
// // // System.out.print(head.num);
// // // }
// // // System.out.println();
// // // }
// // // }

// // // public class findintersectionofTwoLinkedLists {
// // // public static void main(String[] args) {
// // // Solution sol = new Solution();
// // // Node head = new Node(1);
// // // sol.insertNode(head, 3);
// // // sol.insertNode(head, 1);
// // // sol.insertNode(head, 2);
// // // sol.insertNode(head, 4);
// // // Node head1 = head;
// // // head = head.next.next.next; // Intersection point
// // // Node headSec = new Node(3);
// // // Node head2 = headSec;
// // // headSec.next = head;

// // // System.out.print("List1: ");
// // // sol.printList(head1);
// // // System.out.print("List2: ");
// // // sol.printList(head2);

// // // Node answerNode = sol.intersectionPresent(head1, head2);
// // // if (answerNode == null) {
// // // System.out.println("No intersection");
// // // } else {
// // // System.out.println("The intersection point is " + answerNode.num);
// // // }
// // // }
// // // }

// // // // tc: O(m*n) where m and n are the lengths of the two linked lists
// // // // sc: O(1) as we are not using any extra space for data structures

// // //better approach
// // import java.util.*;

// // class Solution {
// // public void insertNode(Node head, int val) {
// // Node newNode = new Node(val);
// // if (head == null) {
// // head = newNode;
// // return;
// // }
// // Node temp = head;
// // while (temp.next != null) {
// // temp = temp.next;
// // }
// // temp.next = newNode;
// // }

// // public Node intersectionPresent(Node head1, Node head2) {
// // Set<Node> st = new HashSet<>();
// // while (head1 != null) {
// // st.add(head1);
// // head1 = head1.next;
// // }
// // while (head2 != null) {
// // if (st.contains(head2)) return head2;
// // head2 = head2.next;
// // }
// // return null;
// // }

// // public void printList(Node head) {
// // while (head != null && head.next != null) {
// // System.out.print(head.num + "->");
// // head = head.next;
// // }
// // if (head != null) {
// // System.out.print(head.num);
// // }
// // System.out.println();
// // }
// // }

// // class Node {
// // int num;
// // Node next;
// // Node(int val) {
// // num = val;
// // next = null;
// // }
// // }

// // public class findintersectionofTwoLinkedLists {
// // public static void main(String[] args) {
// // Solution sol = new Solution();
// // Node head = new Node(1);
// // sol.insertNode(head, 3);
// // sol.insertNode(head, 1);
// // sol.insertNode(head, 2);
// // sol.insertNode(head, 4);
// // Node head1 = head;
// // head = head.next.next.next;
// // Node headSec = new Node(3);
// // Node head2 = headSec;
// // headSec.next = head;

// // System.out.print("List1: ");
// // sol.printList(head1);
// // System.out.print("List2: ");
// // sol.printList(head2);

// // Node answerNode = sol.intersectionPresent(head1, head2);
// // if (answerNode == null) {
// // System.out.println("No intersection");
// // } else {
// // System.out.println("The intersection point is " + answerNode.num);
// // }
// // }

// // }


// // tc: O(m+n) where m and n are the lengths of the two linked lists
// // sc: O(m) for storing the nodes of the first linked list in the hash set

// class Node {
//     int num;
//     Node next;
//     Node(int val) {
//         num = val;
//         next = null;
//     }
// }

// class Solution {
//     public void insertNode(Node head, int val) {
//         Node newNode = new Node(val);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     public int getDifference(Node head1, Node head2) {
//         int len1 = 0, len2 = 0;
//         while (head1 != null || head2 != null) {
//             if (head1 != null) {
//                 len1++;
//                 head1 = head1.next;
//             }
//             if (head2 != null) {
//                 len2++;
//                 head2 = head2.next;
//             }
//         }
//         return len1 - len2;
//     }

//     public Node intersectionPresent(Node head1, Node head2) {
//         int diff = getDifference(head1, head2);

//         if (diff < 0) {
//             while (diff++ != 0) head2 = head2.next;
//         } else {
//             while (diff-- != 0) head1 = head1.next;
//         }
//         while (head1 != null) {
//             if (head1 == head2) return head1; 
//             head2 = head2.next;
//             head1 = head1.next;
//         }
//         return null; 
//     }

//     public void printList(Node head) {
//         while (head != null && head.next != null) {
//             System.out.print(head.num + "->");
//             head = head.next;
//         }
//         if (head != null) {
//             System.out.print(head.num);
//         }
//         System.out.println();
//     }
// }

// public class findintersectionofTwoLinkedLists {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         Node head = new Node(1);
//         sol.insertNode(head, 3);
//         sol.insertNode(head, 1);
//         sol.insertNode(head, 2);
//         sol.insertNode(head, 4);
//         Node head1 = head;
//         head = head.next.next.next;  
//         Node headSec = new Node(3);
//         Node head2 = headSec;
//         headSec.next = head; 

//         System.out.print("List1: ");
//         sol.printList(head1);
//         System.out.print("List2: ");
//         sol.printList(head2);

//         Node answerNode = sol.intersectionPresent(head1, head2);
//         if (answerNode == null) {
//             System.out.println("No intersection");
//         } else {
//             System.out.println("The intersection point is " + answerNode.num);
//         }
//     }
// }

// tc: O(m+n) where m and n are the lengths of the two linked lists
// sc: O(1) as we are not using any extra space for data structures