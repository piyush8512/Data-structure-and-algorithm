// public class areaoflargestrectangleinHistogram {
//     public static int largestArea(int[] arr, int n) {
//         int maxArea = 0;
//         for (int i = 0; i < n; i++) {
//             int minHeight = Integer.MAX_VALUE;
//             for (int j = i; j < n; j++) {
//                 minHeight = Math.min(minHeight, arr[j]);
//                 int area = minHeight * (j - i + 1);
//                 maxArea = Math.max(maxArea, area);
//             }
//         }
//         return maxArea;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 6, 2, 3, 1};
//         int n = arr.length;
//         System.out.println("The largest area in the histogram is " + largestArea(arr, n));
//     }
// }

// //tc: O(n^2)
// //sc: O(1)


//better solution

import java.util.*;

public class areaoflargestrectangleinHistogram {
    static class Solution {
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            Stack<Integer> st = new Stack<>();
            int[] leftsmall = new int[n];
            int[] rightsmall = new int[n];

            // Compute NSL (Nearest Smaller to Left)
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                leftsmall[i] = st.isEmpty() ? 0 : st.peek() + 1;
                st.push(i);
            }

            // Clear the stack for reuse
            st.clear();

            // Compute NSR (Nearest Smaller to Right)
            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                rightsmall[i] = st.isEmpty() ? n - 1 : st.peek() - 1;
                st.push(i);
            }

            // Compute max area
            int maxArea = 0;
            for (int i = 0; i < n; i++) {
                int width = rightsmall[i] - leftsmall[i] + 1;
                maxArea = Math.max(maxArea, heights[i] * width);
            }

            return maxArea;
        }
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3, 1};
        Solution obj = new Solution();
        System.out.println("The largest area in the histogram is " + obj.largestRectangleArea(heights));
    }
}
