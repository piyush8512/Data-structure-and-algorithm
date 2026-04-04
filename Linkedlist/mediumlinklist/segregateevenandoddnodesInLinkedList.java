// public class segregateevenandoddnodesInLinkedList {

// }

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public Node segregateEvenOdd(Node head) {
        if (head == null || head.next == null) return head;
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;
        evenTail.next = oddHead;
        oddTail.next = null;
        return evenHead;
    }
}

// Driver code
 public class segregateevenandoddnodesInLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        Node newHead = sol.segregateEvenOdd(head);

        // Print result
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}



// Time Complexity: O(n) where n is the number of nodes in the linked list.
// Space Complexity: O(1) as we are using only a constant amount of extra space