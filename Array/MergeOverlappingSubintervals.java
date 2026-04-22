// //bruteforce approach

// // import java.util.*;

// // class Solution {
// //     public List<List<Integer>> merge(int[][] intervals) {
// //         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
// //         List<List<Integer>> ans = new ArrayList<>();
// //         int n = intervals.length;
// //         int i = 0;
// //         while (i < n) {
// //             int start = intervals[i][0];
// //             int end = intervals[i][1];
// //             int j = i + 1;
// //             while (j < n && intervals[j][0] <= end) {
// //                 end = Math.max(end, intervals[j][1]);
// //                 j++;
// //             }
// //             ans.add(Arrays.asList(start, end));
// //             i = j;
// //         }
// //         return ans;
// //     }
// // }

// // public class MergeOverlappingSubintervals {
// //     public static void main(String[] args) {
// //         Solution sol = new Solution();
// //         int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
// //         List<List<Integer>> result = sol.merge(intervals);
// //         for (List<Integer> interval : result) {
// //             System.out.print(interval + " ");
// //         }
// //     }
// // }

// // // Time Complexity: O(N2) due to sorting the intervals.
// // // Space Complexity: O(N) in the worst case when all intervals are non-overlapping.


// //optmial approach
// import java.util.*;

// class Solution {
//     public List<List<Integer>> merge(int[][] intervals) {
//         Arrays.sort(
//             intervals,
//             (a, b) -> Integer.compare(a[0], b[0])
//         );
//         List<List<Integer>> merged = new ArrayList<>();
//         for (int[] interval : intervals) {
//             if (
//                 merged.isEmpty() ||
//                 merged.get(merged.size() - 1).get(1) < interval[0]
//             ) {
//                 merged.add(
//                     Arrays.asList(interval[0], interval[1])
//                 );
//             } else {
//                 int last = merged.size() - 1;
//                 int maxEnd = Math.max(
//                     merged.get(last).get(1),
//                     interval[1]
//                 );
//                 merged.get(last).set(1, maxEnd);
//             }
//         }

//         return merged;
//     }
// }

// class MergeOverlappingSubintervals {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[][] intervals = {
//             {1, 3}, {2, 6}, {8, 10}, {15, 18}
//         };

//         List<List<Integer>> result = sol.merge(intervals);

//         for (List<Integer> interval : result) {
//             System.out.print(
//                 "[" + interval.get(0) + "," + interval.get(1) + "] "
//             );
//         }
//     }
// }


// Time Complexity: O(N*logN) + O(N), due to sorting the intervals.
// Space Complexity: O(N) in the worst case when all intervals are non-overlapping.

