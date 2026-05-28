// // // public class detectaCycleinaLinkedList {
    
// // // }


// // import java.util.*;

// // class Node {
// //     int data;
// //     Node next;

// //     Node(int data1, Node next1) {
// //         data = data1;
// //         next = next1;
// //     }
// //     Node(int data1) {
// //         data = data1;
// //         next = null;
// //     }
// // }

// // class Solution {
// //     public boolean detectLoop(Node head) {
// //         Node temp = head;
// //         HashMap<Node, Integer> nodeMap = new HashMap<>();
// //         while (temp != null) {
// //             if (nodeMap.containsKey(temp)) {
// //                 return true;
// //             }
// //             nodeMap.put(temp, 1);
// //             temp = temp.next;
// //         }
// //         return false;
// //     }
// // }

// // public class detectaCycleinaLinkedList {
// //     public static void main(String[] args) {
// //         Node head = new Node(1);
// //         Node second = new Node(2);
// //         Node third = new Node(3);
// //         Node fourth = new Node(4);
// //         Node fifth = new Node(5);

// //         head.next = second;
// //         second.next = third;
// //         third.next = fourth;
// //         fourth.next = fifth;
// //         fifth.next = third;

// //         Solution sol = new Solution();
// //         if (sol.detectLoop(head)) {
// //             System.out.println("Loop detected in the linked list.");
// //         } else {
// //             System.out.println("No loop detected in the linked list.");
// //         }
// //     }
// // }

// // // Time Complexity: O(n*logn) where n is the number of nodes in the linked list.



// //optmial approach
// import java.util.*;

// // Node class represents a
// // node in a linked list
// class Node {
//     // Data stored in the node
//     int data;

//     // Pointer to the next node in the list
//     Node next;

//     // Constructor with both data 
//     // and next node as parameters
//     Node(int data1, Node next1) {
//         data = data1;
//         next = next1;
//     }

//     // Constructor with only data as
//     // a parameter, sets next to null
//     Node(int data1) {
//         data = data1;
//         next = null;
//     }
// }

// // Solution class with detectLoop function
// class Solution {
//     // function to detect loop in linked list
//     public boolean detectLoop(Node head) {
//         // Initialize a pointer 'temp'
//         // at the head of the linked list
//         Node temp = head;

//         // Create a map to keep track of
//         // encountered nodes
//         HashMap<Node, Integer> nodeMap = new HashMap<>();

//         // Step 2: Traverse the linked list
//         while (temp != null) {
//             // If the node is already in the
//             // map, there is a loop
//             if (nodeMap.containsKey(temp)) {
//                 return true;
//             }
//             // Store the current node
//             // in the map
//             nodeMap.put(temp, 1);

//             // Move to the next node
//             temp = temp.next;
//         }

//         // Step 3: If the list is successfully traversed 
//         // without a loop, return false
//         return false;
//     }
// }

// // Driver class
// public class detectaCycleinaLinkedList {
//     public static void main(String[] args) {
//         // Create a sample linked list
//         // with a loop for testing
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);

//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;
//         // Create a loop
//         fifth.next = third;

//         Solution sol = new Solution();

//         // Check if there is a loop 
//         // in the linked list
//         if (sol.detectLoop(head)) {
//             System.out.println("Loop detected in the linked list.");
//         } else {
//             System.out.println("No loop detected in the linked list.");
//         }
//     }
// }
// // Time Complexity: O(n) where n is the number of nodes in the linked list.