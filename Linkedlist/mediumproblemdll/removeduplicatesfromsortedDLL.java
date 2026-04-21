// package Linkedlist.mediumproblemdll;

// public class removeduplicatesfromsortedDLL {

// }
class Node {
    int data;
    Node prev;
    Node next;

    Node(int value) {
        data = value;
        prev = null;
        next = null;
    }
}

class Solution {
    Node head = null;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public Node removeDuplicates() {
        if (head == null)
            return null;
        Node current = head;
        while (current != null && current.next != null) {
            Node nextDistinct = current.next;
            while (nextDistinct != null && nextDistinct.data == current.data) {
                nextDistinct = nextDistinct.next;
            }
            current.next = nextDistinct;
            if (nextDistinct != null) {
                nextDistinct.prev = current;
            }
            current = current.next;
        }
        return head;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class
public class removeduplicatesfromsortedDLL {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] values = { 1, 2, 2, 2, 3, 4, 4, 5, 5, 6 };
        for (int value : values) {
            sol.insertAtEnd(value);
        }
        System.out.print("Original List: ");
        sol.printList();
        sol.removeDuplicates();
        System.out.print("After Removing Duplicates (keeping 1 occurrence): ");
        sol.printList();
    }
}

//tc: O(n^2) sc: O(1) - In the worst case, if all elements are duplicates, we will have to compare each element with every other element, leading to O(n^2) time complexity. The space complexity is O(1) as we are not using any extra space for data structures.