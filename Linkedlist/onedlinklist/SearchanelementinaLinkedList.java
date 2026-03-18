// public class Search an elementinaLinkedList {

// }

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    public boolean searchValue(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class SearchanelementinaLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Solution obj = new Solution();
        if (obj.searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}

//tc: O(n) where n is the number of nodes in the linked list
//sc: O(1) as we are using only a constant amount of extra space for