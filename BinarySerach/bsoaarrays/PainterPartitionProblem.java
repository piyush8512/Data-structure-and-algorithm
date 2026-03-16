// // public class PainterPartitionProblem {

// // }

// import java.util.*;

// public class PainterPartitionProblem {
//     public int countPainters(int[] boards, int time) {
//         int painters = 1;
//         int boardsPainter = 0;

//         for (int board : boards) {
//             if (boardsPainter + board <= time) {

//                 boardsPainter += board;
//             } else {

//                 painters++;
//                 boardsPainter = board;
//             }
//         }

//         return painters;
//     }

//     public int findLargestMinDistance(int[] boards, int k) {
//         int low = Arrays.stream(boards).max().getAsInt();
//         int high = Arrays.stream(boards).sum();
//         for (int time = low; time <= high; time++) {
//             if (countPainters(boards, time) <= k) {
//                 return time;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int[] boards = { 10, 20, 30, 40 };
//         int k = 2;
//         PainterPartitionProblem pp = new PainterPartitionProblem();
//         int ans = pp.findLargestMinDistance(boards, k);

//         System.out.println("The answer is: " + ans); // Expected: 60
//     }
// }

// // Time Complexity: : O(N * (sum(arr[])-max(arr[])+1)), 
// // Space Complexity: O(1) as we are using only a constant amount of extra space

//binary approach 

import java.util.*;

public class PainterPartitionProblem {

    public int countPainters(int[] boards, int time) {
        int painters = 1;
        int boardsPainter = 0;

        for (int board : boards) {
            if (boardsPainter + board <= time) {
                boardsPainter += board;
            } else {
                painters++;
                boardsPainter = board;
            }
        }

        return painters;
    }

    public int findLargestMinDistance(int[] boards, int k) {
        int low = Arrays.stream(boards).max().getAsInt();
        int high = Arrays.stream(boards).sum();
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] boards = { 10, 20, 30, 40 };
        int k = 2;

        PainterPartitionProblem pp = new PainterPartitionProblem();
        int ans = pp.findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);
    }
}
// Time Complexity: O(N log(sum(arr[])-max(arr[])+1)),
// Space Complexity: O(1) as we are using only a constant amount of extra space     
