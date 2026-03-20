// public class InsertatendofDoublyLinkedList {
    
// }




class Node {
    int data;
    Node next;
    Node back;

    public Node(int data1, Node next1, Node back1) {
        data = data1;
        next = next1;
        back = back1;
    }

    public Node(int data1) {
        data = data1;
        next = null;
        back = null;
    }
}

class Solution {
    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head; 
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);  
            prev.next = temp;  
            prev = temp;  
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");  
            head = head.next; 
        }
        System.out.println(); 
    }

    public static Node insertAtTail(Node head, int k) {
        Node newNode = new Node(k);
        if (head == null) {
            return newNode;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
        newNode.back = tail; 
        return head;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 7, 4};
        Node head = Solution.convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially: ");
        Solution.print(head);

        System.out.println("\nDoubly Linked List After Inserting at the tail with value 10: ");
        head = Solution.insertAtTail(head, 10);
        Solution.print(head);
    }
}