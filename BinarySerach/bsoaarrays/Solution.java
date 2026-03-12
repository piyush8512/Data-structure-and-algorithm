


// import java.util.*;

// public class AllocateMinimumNumberofPages {
//     public static int countStudents(ArrayList<Integer> arr, int pages) {
//         int n = arr.size();
//         int students = 1;
//         long pagesStudent = 0;
//         for (int i = 0; i < n; i++) {
//             if (pagesStudent + arr.get(i) <= pages) {
//                 pagesStudent += arr.get(i);
//             } else {
//                 students++;
//                 pagesStudent = arr.get(i);
//             }
//         }
//         return students;
//     }

//     public static int findPages(ArrayList<Integer> arr, int n, int m) {
//         if (m > n)
//             return -1;

//         int low = Collections.max(arr);
//         int high = arr.stream().mapToInt(Integer::intValue).sum();

//         for (int pages = low; pages <= high; pages++) {
//             if (countStudents(arr, pages) == m) {
//                 return pages;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
//         int n = 5;
//         int m = 4;
//         int ans = findPages(arr, n, m);
//         System.out.println("The answer is: " + ans);
//     }
// }

// // Time Complexity: O(n * (sum of pages - max pages))
// // Space Complexity: O(1)







//optimal code 
import java.util.*;

public class Solution {
    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size();
        int students = 1; 
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }
        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);
    }
}

// Time Complexity: O(n log(sum of pages - max pages))
// Space Complexity: O(1)