// // public class reverseaDoublyLinkedList {

// // }

// //BRUTEFORCE SOLUTION

// import java.util.*;

// class Node {
//     int data;
//     Node next;
//     Node back;

//     Node(int data1, Node next1, Node back1) {
//         data = data1;
//         next = next1;
//         back = back1;
//     }

//     Node(int data1) {
//         data = data1;
//         next = null;
//         back = null;
//     }
// }

// class Solution {
//     public Node convertArr2DLL(int[] arr) {
//         Node head = new Node(arr[0]);
//         Node prev = head;
//         for (int i = 1; i < arr.length; i++) {
//             Node temp = new Node(arr[i], null, prev);
//             prev.next = temp;
//             prev = temp;
//         }
//         return head;
//     }

//     public void print(Node head) {
//         while (head != null) {
//             System.out.print(head.data + " ");
//             head = head.next;
//         }
//     }

//     public Node reverseDLL(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         Stack<Integer> st = new Stack<>();
//         Node temp = head;
//         while (temp != null) {
//             st.push(temp.data);
//             temp = temp.next;
//         }
//         temp = head;
//         while (temp != null) {
//             temp.data = st.pop();
//             temp = temp.next;
//         }
//         return head;
//     }
// }

// public class reverseaDoublyLinkedList {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = { 12, 5, 8, 7, 4 };
//         Node head = sol.convertArr2DLL(arr);
//         System.out.println("Doubly Linked List Initially:");
//         sol.print(head);
//         head = sol.reverseDLL(head);
//         System.out.println("\nDoubly Linked List After Reversing:");
//         sol.print(head);
//     }
// }

//OPTMIAL SOLTUION

class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

class Solution {
    public Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public Node reverseDLL(Node head) {

        Node current = head;

        Node last = null;

        while (current != null) {

            Node temp = current.next;
            current.next = current.back;
            current.back = temp;

            last = current;

            current = temp;
        }

        return last;
    }

    public void printDLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class reverseaDoublyLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = sol.convertArr2DLL(arr);

        System.out.print("Original DLL: ");
        sol.printDLL(head);

        Node reversed = sol.reverseDLL(head);

        System.out.print("Reversed DLL: ");
        sol.printDLL(reversed);
    }
}
