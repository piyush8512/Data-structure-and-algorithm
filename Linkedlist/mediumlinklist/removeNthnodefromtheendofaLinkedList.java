// // public class removeNthnodefromtheendofaLinkedList {
    
// // }


// import java.util.*;

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
//     public void printLL(Node head) {
//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }

//     public Node deleteNthNodeFromEnd(Node head, int N) {
//         if (head == null) {
//             return null;
//         }
//         int cnt = 0;
//         Node temp = head;
//         while (temp != null) {
//             cnt++;
//             temp = temp.next;
//         }
//         if (cnt == N) {
//             return head.next;
//         }
//         int res = cnt - N;
//         temp = head;
//         while (temp != null) {
//             res--;
//             if (res == 0) {
//                 break;
//             }
//             temp = temp.next;
//         }
//         temp.next = temp.next.next;

//         return head;
//     }
// }

// public class removeNthnodefromtheendofaLinkedList {
//     public static void main(String[] args) {
//         List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
//         int N = 3;
//         Node head = new Node(arr.get(0));
//         head.next = new Node(arr.get(1));
//         head.next.next = new Node(arr.get(2));
//         head.next.next.next = new Node(arr.get(3));
//         head.next.next.next.next = new Node(arr.get(4));

//         Solution sol = new Solution();

//         // Delete the Nth node from the end
//         head = sol.deleteNthNodeFromEnd(head, N);

//         // Print the modified linked list
//         sol.printLL(head);
//     }
// }

// // Time Complexity: O(L)+O(L-N) where n is the number of nodes in the linked list.
// // Space Complexity: O(1) as we are using only a constant amount of extra space


//optmial approach
import java.util.*;

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
    public void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public Node deleteNthNodeFromEnd(Node head, int N) {

        Node dummy = new Node(0, head);

        Node slow = dummy;
        Node fast = dummy;
        for (int i = 0; i <= N; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

// Main class to execute the program
public class removeNthnodefromtheendofaLinkedList {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int N = 3;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        Solution sol = new Solution();

        head = sol.deleteNthNodeFromEnd(head, N);

        sol.printLL(head);
    }
}
