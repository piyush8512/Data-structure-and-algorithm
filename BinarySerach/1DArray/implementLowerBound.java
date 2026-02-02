// // // package 1DArray;

// // class implementLowerBound {
// //     public int lowerBound(int[] arr, int x) {
// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] >= x) {
// //                 return i;
// //             }
// //         }
// //         return arr.length;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = { 3, 5, 8, 14, 19 };
// //         int x = 15;
// //         implementLowerBound finder = new implementLowerBound();
// //         int index = finder.lowerBound(arr, x);
// //         System.out.println("Lower bound index of " + x + " is: " + index);
// //     }
// // }


// // // Time Complexity: O(n)
// // // Space Complexity: O(1)


// //better approach using binary search
// class LowerBoundFinder {
//     public int lowerBound(int[] arr, int x) {
//         int low = 0;                
//         int high = arr.length - 1;    
//         int ans = arr.length;       

//         while (low <= high) {
//             int mid = (low + high) / 2;  

//             if (arr[mid] >= x) {
//                 ans = mid;     
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;  
//             }
//         }
//         return ans;  
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 8, 15, 19};  // Sorted array
//         int x = 9;                      // Target value

//         LowerBoundFinder finder = new LowerBoundFinder();     
//         int ind = finder.lowerBound(arr, x);    
//         System.out.println("The lower bound is the index: " + ind); 
//     }
// }
// // Time Complexity: O(log n)
// // Space Complexity: O(1)