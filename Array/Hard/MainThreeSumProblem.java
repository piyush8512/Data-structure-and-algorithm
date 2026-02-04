// // // public class ThreeSumProblem {

// // // }

// // import java.util.*;

// // class Solution {
// //     public List<List<Integer>> threeSum(int[] arr, int n) {
// //         Set<List<Integer>> st = new HashSet<>();
// //         for (int i = 0; i < n; i++) {
// //             for (int j = i + 1; j < n; j++) {
// //                 for (int k = j + 1; k < n; k++) {
// //                     if (arr[i] + arr[j] + arr[k] == 0) {
// //                         List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
// //                         Collections.sort(temp);
// //                         st.add(temp);
// //                     }
// //                 }
// //             }
// //         }
// //         return new ArrayList<>(st);
// //     }
// // }

// // public class MainThreeSumProblem {
// //     public static void main(String[] args) {
// //         int[] arr = { -1, 0, 1, 2, -1, -4 };
// //         int n = arr.length;
// //         Solution obj = new Solution();
// //         List<List<Integer>> res = obj.threeSum(arr, n);

// //         for (List<Integer> triplet : res) {
// //             for (int num : triplet)
// //                 System.out.print(num + " ");
// //             System.out.println();
// //         }
// //     }
// // }

// // // Time Complexity: O(n^3*log(no. of unique triplets)) due to three nested
// // // loops.
// // // Space Complexity: O(2 * no. of the unique triplets) where k is the number of
// // // unique triplets found, due



// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] arr, int n) {
//         Set<List<Integer>> ans = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             Set<Integer> hashset = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
//                 int third = -(arr[i] + arr[j]);
//                 if (hashset.contains(third)) {
//                     List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                     Collections.sort(temp);
//                     ans.add(temp);
//                 }
//                 hashset.add(arr[j]);
//             }
//         }
//         return new ArrayList<>(ans);
//     }
// }

// // Driver class
// public class MainThreeSumProblem {
//     public static void main(String[] args) {
//         int[] arr = {-1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         Solution obj = new Solution();
//         List<List<Integer>> res = obj.threeSum(arr, n);

//         for (List<Integer> triplet : res) {
//             for (int num : triplet) System.out.print(num + " ");
//             System.out.println();
//         }
//     }
// }
// //tc: O(N2 * log(no. of unique triplets))
// //sc: O(n + k) where k is the number of unique triplets found.



import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] arr, int n) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        return ans;
    }
}

// Driver class
public class MainThreeSumProblem {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Solution obj = new Solution();
        List<List<Integer>> res = obj.threeSum(arr, n);
        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
//tc: O(N2*nlonN)
//sc: O(1 ) 