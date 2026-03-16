// public class DeleteLastNodeofLinkedList {
    
// }

// Definition for singly linked list
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    public Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}

public class DeleteLastNodeofLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution obj = new Solution();
        head = obj.deleteTail(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

