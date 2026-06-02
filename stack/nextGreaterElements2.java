// // public class nextGreaterElement2 {}

// //bruteforceapprach
// import java.util.*;

// class Solution {
//     public int[] nextGreaterElements(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];
//         Arrays.fill(ans, -1);
//         for (int i = 0; i < n; i++) {
//             int currEle = arr[i];
//             for (int j = 1; j < n; j++) {
//                 int ind = (i + j) % n;
//                 if (arr[ind] > currEle) {
//                     ans[i] = arr[ind];
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

// public class nextGreaterElement2 {
//     public static void main(String[] args) {
//         int[] arr = {5, 7, 1, 7, 6, 0};
//         Solution sol = new Solution();
//         int[] ans = sol.nextGreaterElements(arr);
//         System.out.println("The next greater elements are: ");
//         for (int num : ans) {
//             System.out.print(num + " ");
//         }
//     }
// }
//tc = O(n^2) sc = O(n)


//optimal approach
import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int ind = i % n;
            int currEle = arr[ind];
            while (!st.isEmpty() && st.peek() <= currEle) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    ans[ind] = -1;
                } else {
                    ans[ind] = st.peek();
                }
            }
            st.push(currEle);
        }

        return ans;
    }
}

public class nextGreaterElements2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};
        Solution sol = new Solution();
        int[] ans = sol.nextGreaterElements(arr);

        System.out.print("The next greater elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}

//tc = O(n) sc = O(n)
