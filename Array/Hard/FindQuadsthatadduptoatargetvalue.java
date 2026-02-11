// // public class FindQuadsthatadduptoatargetvalue {

// // }

// import java.util.*;

// class Solution {
//     public List<List<Integer>> fourSum(int[] arr, int target) {
//         int n = arr.length;
//         Set<List<Integer>> set = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     for (int l = k + 1; l < n; l++) {
//                         long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
//                         if (sum == target) {
//                             List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
//                             Collections.sort(temp);
//                             set.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }

// public class FindQuadsthatadduptoatargetvalue {
//     public static void main(String[] args) {
//         int[] arr = { 1, 0, -1, 0, -2, 2 };
//         int target = 0;
//         Solution obj = new Solution();
//         // Get result
//         List<List<Integer>> ans = obj.fourSum(arr, target);

//         // Print result
//         for (List<Integer> quad : ans) {
//             System.out.println(quad);
//         }
//     }
// }

// Time Complexity:O(N3 * log(no. of unique triplets)), where N = size of the array.
// Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.




//better approach
import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long required = (long) target - arr[i] - arr[j] - arr[k];
                    if (seen.contains((int) required)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) required);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}

public class FindQuadsthatadduptoatargetvalue {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Solution obj = new Solution();
        List<List<Integer>> ans = obj.fourSum(arr, target);

        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}
