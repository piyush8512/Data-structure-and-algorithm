// // package Array.Blindsheetarray;

// // public class ContainsDuplicateCheckifavalueappearsatleasttwice {
    
// // }


// // public class ContainsDuplicateCheckifavalueappearsatleasttwice {
// //     public static boolean containsDuplicate(int[] nums) {
// //         for (int i = 0; i < nums.length; i++) {
// //             for (int j = i + 1; j < nums.length; j++) {
// //                 if (nums[i] == nums[j]) {
// //                     return true;
// //                 }
// //             }
// //         }
// //         return false;
// //     }

// //     public static void main(String[] args) {
// //         int[] nums = {1, 2, 3, 1};
// //         boolean res = containsDuplicate(nums);
// //         System.out.println(res ? "true" : "false");
// //     }
// // }

// //tc: O(n^2) sc: O(1)


// //better solution using hashset
// // Solution class containing the method

// import java.util.Arrays;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int index = 1; index < nums.length; index++) {
//             if (nums[index] == nums[index - 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
// public class ContainsDuplicateCheckifavalueappearsatleasttwice {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 1};
//         Solution sol = new Solution();
//         boolean res = sol.containsDuplicate(nums);
//         System.out.println(res ? "true" : "false");
//     }
// }

// //tc: O(nlogn) sc: O(1)


//better solution using hashset
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;
    }
}

// Main class to run the solution
public class ContainsDuplicateCheckifavalueappearsatleasttwice {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Solution sol = new Solution();

        boolean res = sol.containsDuplicate(nums);

        System.out.println(res ? "true" : "false");
    }
}

//tc: O(n) sc: O(n)