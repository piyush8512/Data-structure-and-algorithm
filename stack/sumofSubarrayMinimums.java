// // public class sumofSubarrayMinimums {
// // }

// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int n = arr.length;
//         int mod = (int)1e9 + 7;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             int mini = arr[i];
//             for (int j = i; j < n; j++) {
//                 mini = Math.min(mini, arr[j]);
//                 sum = (sum + mini) % mod;
//             }
//         }
//         return sum;
//     }
// }
// public class sumofSubarrayMinimums {
//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 5};
//         Solution sol = new Solution();
//         int ans = sol.sumSubarrayMins(arr);
//         System.out.println("The sum of minimum value in each subarray is: " + ans);
//     }
// }

// //tc: O(n^2)
// //sc: O(1)


// Optimized Solution using Stack
import java.util.*;

class Solution {

    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    private int[] findPSEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int mod = (int)1e9 + 7;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = left * right * 1L;
            int val = (int)((freq * arr[i]) % mod);
            sum = (sum + val) % mod;
        }
        return sum;
    }
}

public class sumofSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5};
        Solution sol = new Solution();
        int ans = sol.sumSubarrayMins(arr);
        System.out.println("The sum of minimum value in each subarray is: " + ans);
    }
}