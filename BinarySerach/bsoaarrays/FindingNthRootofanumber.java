// class Solution {
//     public int nthRoot(int n, int m) {
//         for (int i = 1; i <= m; i++) {
//             long power = (long) Math.pow(i, n);
//             if (power == m) return i;
//             if (power > m) break;
//         }
//         return -1;
//     }
// }

// // Main class
// public class FindingNthRootofanumber {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int n = 3, m = 27;
//         System.out.println("Nth Root: " + sol.nthRoot(n, m));
//     }
// }
// // Time Complexity: O(m) in the worst case, which is efficient for small values of m and n.
// // Space Complexity: O(1) as we are using only a constant amount of extra space.


class Solution {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            long ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= mid;
                if (ans > m) break;
            }
            if (ans == m) return mid;
            if (ans < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}

public class FindingNthRootofanumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int result = obj.nthRoot(3, 27);
        System.out.println("The 3rd root of 27 is: " + result);
    }
    
}


// Time Complexity: O(log m ) due to the binary search and the loop to calculate mid^n.
// Space Complexity: O(1) as we are using only a constant amount of extra space