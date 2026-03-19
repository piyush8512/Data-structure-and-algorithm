// package Linkedlist.doublylinklist;

// public class DoublyLinkedList {
    
// }
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;    
        prev = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = new Node(arr[0]);
        System.out.println(head);
        System.out.println(head.data);
    }
}
