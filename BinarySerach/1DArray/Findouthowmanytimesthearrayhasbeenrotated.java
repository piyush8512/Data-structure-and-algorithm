// // package BinarySerach.1DArray;

// // public class Findouthowmanytimesthearrayhasbeenrotated {

// // }

// class Solution {
//     public int findRotations(int[] arr) {
//         int n = arr.length;
//         int minVal = arr[0];
//         int minIndex = 0;
//         for (int i = 1; i < n; i++) {
//             if (arr[i] < minVal) {
//                 minVal = arr[i];
//                 minIndex = i;
//             }
//         }
//         return minIndex;
//     }
// }

// public class Findouthowmanytimesthearrayhasbeenrotated {
//     public static void main(String[] args) {
//         Solution obj = new Solution();
//         int[] arr = {4,5,6,7,0,1,2,3};
//         int rotations = obj.findRotations(arr);
//         System.out.println(rotations);
//     }
// }

// // Time Complexity: O(n) - We traverse the array once to find the minimum element and its index.
// // Space Complexity: O(1) - We are using a constant amount of space to store

// class Solution {

//     public int findRotationCount(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 return i + 1;
//             }
//         }
//         return 0;
//     }
// }

// public class Findouthowmanytimesthearrayhasbeenrotated {
//     public static void main(String[] args) {
//         int[] arr = { 3, 4, 5, 1, 2 };
//         Solution sol = new Solution();
//         int rotations = sol.findRotationCount(arr);
//         System.out.println(rotations);
//     }
// }

// // Time Complexity: O(n) - We traverse the array once to find the point of rotation.
// // Space Complexity: O(1) - We are using a constant amount of space to store




//optimal approach 

class Solution {
    
    public int findRotations(int[] arr) {
        int low = 0;
        int high = arr.length - 1;        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {       
                high = mid;
            }
        }
        return low;
    }
}

public class Findouthowmanytimesthearrayhasbeenrotated {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4,5,6,7,0,1,2,3};
        int rotations = sol.findRotations(arr);
        System.out.println(rotations);
    }
}
// Time Complexity: O(log n) - We are using binary search to find the point of rotation.
// Space Complexity: O(1) - We are using a constant amount of space to store the low, high, and mid variables.