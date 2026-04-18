// public class FindallPairswithgivenSuminDLL {

// }

import java.util.*;

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

    public static List<List<Integer>> findPairs(Node head, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (head == null)
            return result;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && right.next != left) {
            int sum = left.data + right.data;

            if (sum == target) {
                result.add(Arrays.asList(left.data, right.data));
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return result;
    }

    // Helper to create DLL
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 8);
        head = insert(head, 9);

        int target = 7;

        List<List<Integer>> pairs = findPairs(head, target);

        for (List<Integer> pair : pairs) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}

// tc: O(n) - we traverse the list at most once with two pointers
// sc: O(1) - we only use a constant amount of extra space for pointers