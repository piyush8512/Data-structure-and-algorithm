// public class FindtheLengthofaLinkedList {
    
// }


class Node {
    int data;
    Node next;
    Node(int data1) {
        data = data1;
        next = null;
    }
}

class Solution {
    public int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

// Main class to run the program
public class FindtheLengthofaLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Solution obj = new Solution();
        System.out.println("Length of Linked List: "
                           + obj.lengthOfLinkedList(head));
    }
}


//tc: O(n) where n is the number of nodes in the linked list
//sc: O(1) as we are using only a   constant amount of extra space for the count variable and temp pointer