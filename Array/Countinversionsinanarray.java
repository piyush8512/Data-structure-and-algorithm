// // public class Countinversionsinanarray {

// // }

// public class Countinversionsinanarray {
//     static int numberOfInversions(int[] arr) {
//         int cnt = 0;
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] > arr[j])
//                     cnt++;
//             }
//         }
//         return cnt;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 4, 3, 2, 1 };
//         int inversions = numberOfInversions(arr);
//         System.out.println("The number of inversions is: " + inversions);
//     }
// }
// //tc 0(n^2)
// //sc 0(1)


//optimal apprioachj

class Solution {
    public int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;
        int cnt = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                cnt += (mid - left + 1); // Count inversions
            }
        }

        // Copy remaining elements of left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return cnt;
    }

    // Merge sort function
    public int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;

        if (low >= high) return cnt;

        int mid = (low + high) / 2;

        // Count inversions in left half
        cnt += mergeSort(arr, low, mid);
        // Count inversions in right half
        cnt += mergeSort(arr, mid + 1, high);
        // Count inversions during merge
        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    // Function to get number of inversions
    public int numberOfInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}

public class Countinversionsinanarray {
    public static void main(String[] args) {
        // Input array
        int[] a = {5, 4, 3, 2, 1};
        // Create Solution object
        Solution obj = new Solution();
        // Count inversions
        int cnt = obj.numberOfInversions(a);
        System.out.println("The number of inversions are: " + cnt);
    }
}
