// // public class subsetSumSumofallSubsets {

// // }

// import java.util.*;

// class SubsetSumSolution {
//     public List<Integer> subsetSums(int[] arr) {
//         int n = arr.length;
//         List<Integer> sums = new ArrayList<>();
//         for (int mask = 0; mask < (1 << n); mask++) {
//             int sum = 0;
//             for (int i = 0; i < n; i++) {
//                 if ((mask & (1 << i)) != 0) {
//                     sum += arr[i];
//                 }
//             }
//             sums.add(sum);
//         }
//         Collections.sort(sums);
//         return sums;
//     }
// }

// public class subsetSumSumofallSubsets {
//     public static void main(String[] args) {
//         SubsetSumSolution sol = new SubsetSumSolution();
//         int[] arr = { 5, 2, 1 };
//         List<Integer> result = sol.subsetSums(arr);
//         for (int sum : result) {
//             System.out.print(sum + " ");
//         }
//         System.out.println();
//     }
// }

// // tc: O(n * 2^n) due to generating all subsets and calculating their sums
// // sc: O(2^n) for storing all subset sums in the list


//optimal solution using recursion
import java.util.*;

class Solution {
    public void findSums(int index, int currentSum, int[] arr, List<Integer> sums) {
        if (index == arr.length) {
            sums.add(currentSum);
            return;
        }
        findSums(index + 1, currentSum + arr[index], arr, sums);
        findSums(index + 1, currentSum, arr, sums);
    }

    public List<Integer> subsetSums(int[] arr) {
        List<Integer> sums = new ArrayList<>();
        findSums(0, 0, arr, sums);
        Collections.sort(sums);
        return sums;
    }
}

public class subsetSumSumofallSubsets {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {5, 2, 1};
        List<Integer> result = sol.subsetSums(arr);

        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}

// tc: O(2^n) due to generating all subsets
// sc: O(2^n) for storing all subset sums in the list, and