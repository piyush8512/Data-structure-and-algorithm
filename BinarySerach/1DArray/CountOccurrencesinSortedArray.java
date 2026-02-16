

// //brute force approach
// public class CountOccurrencesinSortedArray {
//     public static int count(int arr[], int n, int x) {
//         int cnt = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == x) cnt++;
//         }
//         return cnt;
//     }

//     public static void main(String[] args) {
//         int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
//         int n = 8, x = 8;
//         int ans = count(arr, n, x);
//         System.out.println("The number of occurrences is: " + ans);
//     }
// }
// // Time Complexity: O(N), where N is the size of the array.
// // Space Complexity: O(1) as we are using only a constant amount of extra space

public class CountOccurrencesinSortedArray {

    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
//tc: 2*logN), for finding the first and last occurrence, so overall O(logN).
//sc: O(1) as we are using only a constant amount of extra space.