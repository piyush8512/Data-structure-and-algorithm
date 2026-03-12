
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
    public Node insertAtHead(Node head, int newData) {
        Node newNode = new Node(newData, head);
        return newNode;
    }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Main class
public class InsertattheheadofLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        sol.printList(head);
        head = sol.insertAtHead(head, 1);

        System.out.print("After Insertion at Head: ");
        sol.printList(head);
    }
}
