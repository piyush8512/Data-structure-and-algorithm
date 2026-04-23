// public class flatteningaLinkedList {
    
// }

import java.util.*;

// Node definition for linked list with child pointers
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode child1) {
        val = data1;
        next = next1;
        child = child1;
    }
}

class Solution {
    private ListNode convertArrToLinkedList(List<Integer> arr) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        for (int val : arr) {
            temp.child = new ListNode(val);
            temp = temp.child;
        }
        return dummyNode.child;
    }

    public ListNode flattenLinkedList(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            ListNode t2 = head;
            while (t2 != null) {
                arr.add(t2.val);
                t2 = t2.child;
            }
            head = head.next;
        }

        Collections.sort(arr);
        return convertArrToLinkedList(arr);
    }
}

 
public class flatteningaLinkedList {
    // Print the linked list in a single line
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void printOriginalLinkedList(ListNode head, int depth) {
        while (head != null) {
            System.out.print(head.val);
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(10);
        head.next.child = new ListNode(4);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(20);
        head.next.next.child.child = new ListNode(13);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        // Print original list
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten and print
        Solution sol = new Solution();
        ListNode flattened = sol.flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}
