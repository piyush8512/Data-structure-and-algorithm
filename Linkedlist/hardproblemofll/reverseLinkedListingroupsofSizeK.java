// package Linkedlist.hardproblemofll;

// public class reverseLinkedListingroupsofSizeK {
    
// }

// import.java.util.*;
// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    // Function to reverse nodes in groups of k
    public ListNode reverseKGroup(ListNode head, int k) {
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pointer to the tail of the last reversed group
        ListNode groupPrev = dummy;

        while (true) {
            // Get the k-th node in the current group
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) break;

            // Store the next group’s head
            ListNode groupNext = kth.next;

            // Reverse the current k-group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            for (int i = 0; i < k; i++) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect the previous group to the reversed group
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }

        // Return the new head
        return dummy.next;
    }

    // Helper function to get the k-th node from the current node
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}

// Driver class
class reverseLinkedListingroupsofSizeK {
    public static void main(String[] args) {
        Solution obj = new Solution();

        // Creating the linked list: 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        // Reversing in groups of k
        ListNode result = obj.reverseKGroup(head, k);

        // Printing the final list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
