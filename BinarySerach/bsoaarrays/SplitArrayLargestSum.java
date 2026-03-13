// // public class SplitArrayLargestSum {
    
// // }


// import java.util.*;

// class SplitArrayLargestSum {
//     public int countPartitions(int[] a, int maxSum) {
//         int n = a.length;
//         int partitions = 1;
//         long subarraySum = 0;
//         for (int i = 0; i < n; i++) {
//             if (subarraySum + a[i] <= maxSum) {
//                 subarraySum += a[i];
//             } else {
//                 partitions++;
//                 subarraySum = a[i];
//             }
//         }
//         return partitions;
//     }

//     public int largestSubarraySumMinimized(int[] a, int k) {
//         int low = Arrays.stream(a).max().getAsInt();
//         int high = Arrays.stream(a).sum();
//         for (int maxSum = low; maxSum <= high; maxSum++) {
//             if (countPartitions(a, maxSum) == k) {
//                 return maxSum;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int[] a = {10, 20, 30, 40};
//         int k = 2;
//         SplitArrayLargestSum sp = new SplitArrayLargestSum();
//         int ans = sp.largestSubarraySumMinimized(a, k);
//         System.out.println("The answer is: " + ans);
//     }
// }
// tc : O(n * sum of array) sc : O(1)



//optmial solution


import java.util.*;

class SubarrayPartitioner {
    public int countPartitions(int[] a, int maxSum) {
        int partitions = 1;
        long subarraySum = 0;
        for (int num : a) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }

    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = Arrays.stream(a).max().getAsInt(); 
        int high = Arrays.stream(a).sum(); 
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        SubarrayPartitioner sp = new SubarrayPartitioner();
        int ans = sp.largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}

// tc : O(n log(sum of array)) sc : O(1)

