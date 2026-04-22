// // // public class arrayReverse {
    
// // // }

// // //naive approach

// // class arrayReverse {
    
// //     static void reverseArray(int[] arr) {
// //         int n = arr.length;
// //         int[] temp = new int[n];
// //         for (int i = 0; i < n; i++)
// //             temp[i] = arr[n - i - 1];
// //         for (int i = 0; i < n; i++)
// //             arr[i] = temp[i];
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = { 1, 4, 3, 2, 6, 5 };
// //         reverseArray(arr);
// //         for (int i = 0; i < arr.length; i++) 
// //             System.out.print(arr[i] + " ");
// //     }
// // }

// // // tc: O(n)
// // // sc: O(n)


// //better approach

// // class arrayReverse {
// //     static void reverseArray(int[] arr) {
// //         int left = 0, right = arr.length - 1;
// //         while (left < right) {
// //             int temp = arr[left];
// //             arr[left] = arr[right];
// //             arr[right] = temp;
// //             left++;
// //             right--;
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = { 1, 4, 3, 2, 6, 5 };
// //         reverseArray(arr);
// //         for (int i = 0; i < arr.length; i++) 
// //             System.out.print(arr[i] + " ");
// //     }
// // }

// // // tc: O(n)
// // // sc: O(1)


// //

// class arrayReverse {
    
//     static void reverseArray(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 4, 3, 2, 6, 5 };
//         reverseArray(arr);
//         for (int i = 0; i < arr.length; i++) 
//             System.out.print(arr[i] + " ");
//     }
// }

// // tc: O(n)
// // sc: O(1)



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class arrayReverse {
    static void reverseArray(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        List<Integer> arr =  new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
        reverseArray(arr);
        for (int i = 0; i < arr.size(); i++) 
            System.out.print(arr.get(i) + " ");
    }
}