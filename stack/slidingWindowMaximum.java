// // SlidingWindowMaximum

// import java.util.*;

// class Solution {
//     public List<Integer> maxSlidingWindow(int[] nums, int k) {
//         List<Integer> result = new ArrayList<>();
//         for (int i = 0; i <= nums.length - k; i++) {
//             int maxVal = nums[i];
//             for (int j = i; j < i + k; j++) {
//                 maxVal = Math.max(maxVal, nums[j]);
//             }
//             result.add(maxVal);
//         }
//         return result;
//     }
// }

// public class slidingWindowMaximum {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
//         int k = 3;

//         List<Integer> ans = obj.maxSlidingWindow(arr, k);

//         for (int num : ans) {
//             System.out.print(num + " ");
//         }
//     }
// }


// // Time Complexity: O(n)
// // Space Complexity: O(1)



//optimal solution
import java.util.*;

class Solution {
    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                result.add(nums[dq.peekFirst()]);
            }
        }
        return result;
    }
}

// Driver code
public class slidingWindowMaximum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {4, 0, -1, 3, 5, 3, 6, 8};
        int k = 3;
        List<Integer> ans = obj.maxSlidingWindow(arr, k);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
