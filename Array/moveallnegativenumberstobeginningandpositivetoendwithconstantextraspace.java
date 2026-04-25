// // public class moveallnegativenumberstobeginningandpositivetoendwithconstantextraspace {

// // }

// //bruteforcesolution
// import java.util.Arrays;
// class Solution{

//     static int[] move(int[] arr){
//         Arrays.sort(arr);
//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr =  {-12, 11, -13, -5, -6, -7, 5, -3, -6 };
//         int[] ans = move(arr);
//         for (int num : ans){
//             System.out.println(num + " ");
//         }
//         System.out.println("");
//     }
// }
//tc  Onlogn  sc o1

//Quick sor partitions
// class Solution {
//     static int[] move(int[] arr) {
//         int j = 0;
//         for (int i = 0; i < arr.length; i++) {

//             // If negative number is present
//             // swap it with arr[j]
//             if (arr[i] < 0) {
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }

//         return arr;
//     }
//     public static void main(String[] args) {
//         int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
//         int[] ans = move(arr);

//         for (int num : ans) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

//on o1

class Solution {

    static int[] move(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] < 0) {
                left++;
            }

            while (right > left && arr[right] > 0) {
                right--;
            }

            if (right > left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int[] ans = move(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//on o1