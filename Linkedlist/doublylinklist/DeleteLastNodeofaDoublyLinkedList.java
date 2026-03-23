// public class DeleteLastNodeofaDoublyLinkedList {
    
// }


class Node {
    int data;
    Node prev, next;
    Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

class Solution {
    public Node deleteTail(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }
}

public class DeleteLastNodeofaDoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        Solution obj = new Solution();
        head = obj.deleteTail(head);
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

//tc: O(n)
//sc: O(1)