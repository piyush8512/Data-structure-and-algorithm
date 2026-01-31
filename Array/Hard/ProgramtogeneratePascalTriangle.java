// package Array.Hard;

// import java.util.*;
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<>();
//         for (int i = 0; i < numRows; i++) {
//             List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
//             for (int j = 1; j < i; j++) {
//                 row.set(j, triangle.get(i - 1).get(j - 1) +
//                            triangle.get(i - 1).get(j));
//             } 
//             triangle.add(row);
//         }
//         return triangle;
//     }
// }

// public class ProgramtogeneratePascalTriangle {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int n = 5;

//         // Generate and print Pascal's Triangle
//         List<List<Integer>> result = obj.generate(n);
//         for (List<Integer> row : result) {
//             for (Integer val : row) System.out.print(val + " ");
//             System.out.println();
//         }
//     }
// }

// // Time Complexity: O(numRows^2)
// // Space Complexity: O(numRows^2)



//better approach
// import java.util.*;
// class Solution {
//     public List<Long> getNthRow(int N) {
//         List<Long> row = new ArrayList<>();
//         long val = 1;
//         row.add(val);
//         for (int k = 1; k < N; k++) {
//             val = val * (N - k) / k;
//             row.add(val);
//         }
        
//         return row;
//     }
// }

// public class ProgramtogeneratePascalTriangle {
//     public static void main(String[] args) {
//         int N = 5; // Example: 5th row
//         Solution sol = new Solution();
//         List<Long> result = sol.getNthRow(N);
//         for (long num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }
// //tc: O(N)
// //sc: O(N)


class Solution {
    public long findPascalElement(int r, int c) {
        int n = r - 1;
        int k = c - 1;
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}

public class ProgramtogeneratePascalTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int r = 5, c = 3;
        System.out.println(sol.findPascalElement(r, c));
    }
}

//tc: O(min(r,c))
//sc: O(1)