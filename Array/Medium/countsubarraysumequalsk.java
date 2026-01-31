
// //brute force approach
// class Solution {
//     public int subarraySum(int[] arr, int k) {
//         int n = arr.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int sum = 0;
//                 for (int m = i; m <= j; m++) {
//                     sum += arr[m];
//                 }
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// public class countsubarraysumequalsk {
//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 4};
//         int k = 6;
//         Solution sol = new Solution();
//         int result = sol.subarraySum(arr, k);
//         System.out.println("The number of subarrays is: " + result);
//     }
// }

// //tc: O(n^3)
// //sc: O(1)

// //better approach
// class Solution {
//     public int subarraySum(int[] arr, int k) {
//         int n = arr.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// public class countsubarraysumequalsk {
//     public static void main(String[] args) {
//         int[] arr = { 3, 1, 2, 4 };
//         int k = 6;
//         Solution sol = new Solution();
//         int result = sol.subarraySum(arr, k);
//         System.out.println("The number of subarrays is: " + result);
//     }
// }
// //tc: O(n^2)
// //sc: O(1)


//optimal approach
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        prefixSumCount.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int remove = prefixSum - k;
            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}

public class countsubarraysumequalsk {
    public static void main(String[] args) {
        // Input array
        int[] arr = {3, 1, 2, 4};

        // Target sum
        int k = 6;

        // Create Solution object
        Solution sol = new Solution();

        // Call function and store result
        int result = sol.subarraySum(arr, k);

        // Print the count of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}
