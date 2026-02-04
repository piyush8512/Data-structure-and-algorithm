
// public class BinarySearchInsert {
//     public int searchInsert(int[] arr, int x) {
//         int n = arr.length;
//         int low = 0, high = n - 1;
//         int ans = n;
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
//         int[] arr = { 1, 2, 4, 7 };
//         int x = 6;

//         BinarySearchInsert obj = new BinarySearchInsert();
//         int index = obj.searchInsert(arr, x);

//         System.out.println("The index is: " + index);
//     }
// }

// //tc: O(log n)
// //sc: O(1)