// // // public class findthePrefixCommonArrayofTwoArrays {
    
// // // }

// // //brute force approach
// // class Solution {
// //     public int[] findThePrefixCommonArray(int[] A, int[] B) {
// //         int[] ans = new int[A.length];
// //         for (int i = 0; i < A.length; i++) {
// //             int count = 0;
// //             for (int num = 1; num <= A.length; num++) {
// //                 boolean foundInA = false;
// //                 boolean foundInB = false;
// //                 for (int j = 0; j <= i; j++) {
// //                     if (A[j] == num) {
// //                         foundInA = true;
// //                     }
// //                     if (B[j] == num) {
// //                         foundInB = true;
// //                     }
// //                 }
// //                 if (foundInA && foundInB) {
// //                     count++;
// //                 }
// //             }
// //             ans[i] = count;
// //         }
// //         return ans;
// //     }
// // }

// // public class findthePrefixCommonArrayofTwoArrays {
// //     public static void main(String[] args) {
// //         Solution obj = new Solution();
// //         int[] A = {1, 2, 3, 4};
// //         int[] B = {2, 1, 4, 5};
// //         int[] result = obj.findThePrefixCommonArray(A, B);
// //         for (int num : result) {
// //             System.out.print(num + " ");
// //         }
// //     }
// // }


// //better approach
// import java.util.HashSet;

// class Solution {
//     public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         int n = A.length;
//         int[] ans = new int[n];
//         HashSet<Integer> seenA = new HashSet<>();
//         HashSet<Integer> seenB = new HashSet<>();
//         int common = 0;
//         for (int i = 0; i < n; i++) {
//             int a = A[i];
//             int b = B[i];
//             if (seenB.contains(a)) {
//                 common++;
//             }
//             seenA.add(a);
//             if (seenA.contains(b)) {
//                 common++;
//             }
//             seenB.add(b);
//             ans[i] = common;
//         }
//         return ans;
//     }
// }

// public class findthePrefixCommonArrayofTwoArrays {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] A = {1, 2, 3, 4};
//         int[] B = {2, 1, 4, 5};
//         int[] result = obj.findThePrefixCommonArray(A, B);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }

// //tc: O(n) where n is the length of the input arrays
// //sc: O(n) for the hash sets and the answer array


//optimal approach

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n + 1];
        int common = 0;
        for (int i = 0; i < n; i++) {
            freq[A[i]]++;
            if (freq[A[i]] == 2) {
                common++;
            }
            freq[B[i]]++;
            if (freq[B[i]] == 2) {
                common++;
            }
            ans[i] = common;
        }
        return ans;
    }
}

public class findthePrefixCommonArrayofTwoArrays {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] A = {1, 2, 3, 4};
        int[] B = {2, 1, 4, 5};
        int[] result = obj.findThePrefixCommonArray(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
