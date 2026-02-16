// import java.util.*;

// class Solution {
//     public int solve(int n, int key, List<Integer> v) {
//         int res = -1;
//         for (int i = n - 1; i >= 0; i--) {  
//             if (v.get(i) == key) {
//                 res = i;
//                 break;
//             }
//         }
//         return res;
//     }
// }

// public class Lastoccurrenceinasortedarray {
//     public static void main(String[] args) {
//         int n = 7;
//         int key = 13;
//         List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
//         Solution sol = new Solution();
//         int ans = sol.solve(n, key, v);
//         System.out.println(ans);
//     }
// }   

// Time Complexity: O(N), where N is the size of the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space.

// optimal approach
import java.util.*;

// provides last-occurrence binary search
class Solution {
    public int solve(int n, int key, List<Integer> v) {
        int start = 0;
        int end = n - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v.get(mid) == key) {
                res = mid;
                start = mid + 1;
            }
            else if (key < v.get(mid)) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return res;
    }
}

public class Lastoccurrenceinasortedarray {
    public static void main(String[] args) {
        int key = 13;
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        int n = v.size();
        Solution sol = new Solution();
        int ans = sol.solve(n, key, v);
        System.out.println(ans);
    }
}

// Time Complexity: O(log N), where N is the size of the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space