// // // package BinarySerach.1DArray;

// // // public class SearchSingleElementinasortedarray {

// // // }

// //  class Solution {
// //     public int singleNonDuplicate(int[] arr) {
// //         int n = arr.length;
// //         if (n == 1) return arr[0];
// //         for (int i = 0; i < n; i++) {
// //             if (i == 0) {
// //                 if (arr[i] != arr[i + 1])
// //                     return arr[i];
// //             }
// //             else if (i == n - 1) {
// //                 if (arr[i] != arr[i - 1])
// //                     return arr[i];
// //             }
// //             else {
// //                 if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
// //                     return arr[i];
// //             }
// //         }
// //         return -1;
// //     }
// // }

// // // Driver class with main method
// // class SearchSingleElementinasortedarray {
// //     public static void main(String[] args) {
// //         int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
// //         Solution obj = new Solution();
// //         int ans = obj.singleNonDuplicate(arr);
// //         System.out.println("The single element is: " + ans);
// //     }
// // }
// // // Time Complexity: O(N)
// // // Space Complexity: O(1)


// //bruteforce -2 
//  class Solution {
//     // Function to find the single non-duplicate element using XOR
//     public int singleNonDuplicate(int[] arr) {
//         int n = arr.length;
//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             ans = ans ^ arr[i];
//         }
//         return ans;
//     }
// }

// // Separate Main class to run the driver code
// class SearchSingleElementinasortedarray {
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
//         Solution obj = new Solution();
//         int ans = obj.singleNonDuplicate(arr);
//         System.out.println("The single element is: " + ans);
//     }
// }

// // Time Complexity: O(N)
// // Space Complexity: O(1)

//optimal solution

class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        Solution obj = new Solution();
        int ans = obj.singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }
}
// Time Complexity: O(log N)
// Space Complexity: O(1)
