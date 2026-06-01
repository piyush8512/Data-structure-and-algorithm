// // public class kthlargestsmallestelementinanarray {
    
// // }


// import java.util.*;

// class Solution {
//     public int kthLargestElement(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i = 0; i < k; i++) {
//             pq.add(nums[i]);
//         }
//         for(int i = k; i < nums.length; i++) {
//             if(nums[i] > pq.peek()) {
//                 pq.poll(); 
//                 pq.add(nums[i]);
//             }
//         }
//         return pq.peek(); 
//     }
// }

// // Driver code
// public class kthlargestsmallestelementinanarray {
//     public static void main(String[] args) {
//         int[] nums = {-5, 4, 1, 2, -3};
//         int k = 5;
//         Solution sol = new Solution();
//         int ans = sol.kthLargestElement(nums, k);
//         System.out.println("The Kth largest element in the array is: " + ans);
//     }
// }

// // Time Complexity: O(n log k) where n is the number of elements in the array and k is the size of the priority queue.
// // Space Complexity: O(k) for the priority queue that holds k elements.


//optimal approach 
import java.util.*;
class Solution {
    public int kthLargestElement(int[] nums, int k) {
        if (k > nums.length) return -1;
        int left = 0, right = nums.length - 1;
        while (true) {
            int pivotIndex = randomIndex(left, right);
            pivotIndex = partitionAndReturnIndex(nums, pivotIndex, left, right);
            if (pivotIndex == k - 1) return nums[pivotIndex];
            else if (pivotIndex > k - 1) right = pivotIndex - 1;
            else left = pivotIndex + 1;
        }
    }
    
    private Random rand = new Random();
    private int randomIndex(int left, int right) {
        int len = right - left + 1;
        return rand.nextInt(len) + left;
    }

    // Function to perform the partition and return the updated index of pivot
    private int partitionAndReturnIndex(int[] nums, int pivotIndex, int left, int right) {
        int pivot = nums[pivotIndex]; // Get the pivot element
        
        // Swap the pivot with the left element
        int temp = nums[left];
        nums[left] = nums[pivotIndex];
        nums[pivotIndex] = temp;
        
        int ind = left + 1; // Index to mark the start of right portion
        
        // Traverse on the array
        for (int i = left + 1; i <= right; i++) {
            
            // If the current element is greater than the pivot
            if (nums[i] > pivot) {
                // Place the current element in the left portion
                temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                
                // Move the right portion index
                ind++;
            }
        }
        
        // Place the pivot at the correct index
        temp = nums[left];
        nums[left] = nums[ind - 1];
        nums[ind - 1] = temp;
        
        return ind - 1; // Return the index of pivot now
    }
}

public class kthlargestsmallestelementinanarray {
    public static void main(String[] args) {
        int[] nums = {-5, 4, 1, 2, -3};
        int k = 5;
        Solution sol = new Solution();
        int ans = sol.kthLargestElement(nums, k);
        System.out.println("The Kth largest element in the array is: " + ans);
    }
}