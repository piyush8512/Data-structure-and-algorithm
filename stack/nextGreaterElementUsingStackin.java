// // public class nextGreaterElementUsingStack {
    
// // }


// import java.util.*;

// class Solution {
//     public int[] nextGreater(int[] nums) {
//         Stack<Integer> st = new Stack<>();
//         int n = nums.length;
//         int[] res = new int[n];
//         for (int i = n - 1; i >= 0; i--) {
//             while (!st.isEmpty() && st.peek() <= nums[i]) {
//                 st.pop();
//             }
//             if (st.isEmpty()) res[i] = -1;
//             else res[i] = st.peek();
//             st.push(nums[i]);
//         }
//         return res;
//     }
// }

// public class nextGreaterElementUsingStackin {
//     public static void main(String[] args) {
//         int[] nums = {4, 5, 2, 10};
//         Solution sol = new Solution();
//         int[] ans = sol.nextGreater(nums);
//         for (int x : ans) {
//             System.out.print(x + " ");
//         }
//         System.out.println();
//     }
// }


//tc: O(n) where n is the number of elements in the input array. Each element is pushed and popped at most once.
//sc: O(n) in the worst case when the stack contains all elements of the input