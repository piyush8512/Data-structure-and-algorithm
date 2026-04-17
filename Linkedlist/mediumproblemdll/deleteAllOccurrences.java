// package Linkedlist.mediumproblemdll;

// public @interface deleteAllOccurrences {
    
// }

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Solution {
    public static Node deleteAllOccurrences(Node head, int key) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {

                // If node to be deleted is head
                if (curr.prev == null) {
                    head = curr.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } 
                else {
                    // Link previous node to next
                    curr.prev.next = curr.next;

                    // Link next node to previous
                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }
                }
            }
            curr = curr.next;
        }

        return head;
    }
}

public class deleteAllOccurrences {
    public static void main(String[] args) {
        // Create a sample doubly linked list: 1 <-> 2 <-> 3 <-> 2 <-> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;

        int key = 2;
        head = Solution.deleteAllOccurrences(head, key);

        // Print the modified list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

// Output should be: 1 3 4
//tc: O(n) where n is the number of nodes in the linked list
//sc: O(1) as we are not using any extra space for another data structure