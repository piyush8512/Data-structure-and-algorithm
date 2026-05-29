// public class kthlargestsmallestelementinanarray {
    
// }


import java.util.*;

class Solution {
    public int kthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(nums[i] > pq.peek()) {
                pq.poll(); 
                pq.add(nums[i]);
            }
        }
        return pq.peek(); 
    }
}

// Driver code
public class kthlargestsmallestelementinanarray {
    public static void main(String[] args) {
        int[] nums = {-5, 4, 1, 2, -3};
        int k = 5;
        Solution sol = new Solution();
        int ans = sol.kthLargestElement(nums, k);
        System.out.println("The Kth largest element in the array is: " + ans);
    }
}

// Time Complexity: O(n log k) where n is the number of elements in the array and k is the size of the priority queue.
// Space Complexity: O(k) for the priority queue that holds k elements.