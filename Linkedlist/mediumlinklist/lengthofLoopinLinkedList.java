// // public class lengthofLoopinLinkedList {
    
// // }


// import java.util.*;

// // Node class represents a node in a linked list
// class Node {
//     int data;
//     Node next;

//     Node(int data1, Node next1) {
//         data = data1;
//         next = next1;
//     }

//     Node(int data1) {
//         data = data1;
//         next = null;
//     }
// }

// class Solution {
//     public int lengthOfLoop(Node head) {
//         HashMap<Node, Integer> visitedNodes = new HashMap<>();
//         Node temp = head;
//         int timer = 0;
//         while (temp != null) {
//             if (visitedNodes.containsKey(temp)) {
//                 int loopLength = timer - visitedNodes.get(temp);
//                 return loopLength;
//             }
//             visitedNodes.put(temp, timer);
//             temp = temp.next;
//             timer++;
//         }
//         return 0;
//     }
// }

// // Main driver class
// public class lengthofLoopinLinkedList {
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         Node second = new Node(2);
//         Node third = new Node(3);
//         Node fourth = new Node(4);
//         Node fifth = new Node(5);
//         head.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;
//         fifth.next = second;
//         Solution obj = new Solution();
//         int loopLength = obj.lengthOfLoop(head);
//         if (loopLength > 0) {
//             System.out.println("Length of the loop: " + loopLength);
//         } else {
//             System.out.println("No loop found in the linked list.");
//         }
//     }
// }
// // Time Complexity: O(N) where N is the number of nodes in the linked list.

//optimal solution
// Node class represents a node in a linked list
class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node next;

    // Constructor with both data and next node
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class containing the loop length function
class Solution {
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }

    public int countLoopLength(Node meetingPoint) {
        Node temp = meetingPoint;
        int length = 1;
        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}

// Main driver class
public class lengthofLoopinLinkedList  {
    public static void main(String[] args) {

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = second;

        Solution obj = new Solution();

        int loopLength = obj.lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}

// Time Complexity: O(N) where 1 is the number of nodes in the linked list.
