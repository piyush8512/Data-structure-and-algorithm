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
//     Node deleteMiddle(Node head) {
//         Node temp = head;
//         int n = 0;
//         while (temp != null) {
//             n++;
//             temp = temp.next;
//         }
//         int res = n / 2;
//         temp = head;
//         while (temp != null) {
//             res--;
//             if (res == 0) {
//                 Node middle = temp.next;
//                 temp.next = temp.next.next;
//                 break;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }
// }

// public class deletetheMiddleNodeoftheLinkedList {
//     public static void printLL(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);
//         System.out.print("Original Linked List: ");
//         printLL(head);
//         Solution obj = new Solution();
//         head = obj.deleteMiddle(head);
//         System.out.print("Updated Linked List: ");
//         printLL(head);
//     }
// }/
//tc = o(n+n/2)
//sc = o(1)

//optmial solution

// Node class represents a node in the linked list
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {
    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

public class deletetheMiddleNodeoftheLinkedList {
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.print("Original Linked List: ");
        printLL(head);
        Solution obj = new Solution();
        head = obj.deleteMiddle(head);
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}

//tc = o(n/2)
//sc = o(1)
