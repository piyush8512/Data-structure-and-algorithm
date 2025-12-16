package Array.Easy;
///leetcode 26 Remove Duplicates from Sorted Array



//bruteforece using hash set 
// import java.util.HashSet;

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashSet<Integer> seen = new HashSet<>();
//         int index = 0;
//         for (int num : nums) {
//             if (!seen.contains(num)) {
//                 seen.add(num);   
//                 nums[index] = num;
//                 index++;
//             }
//         }
//         return index;
//     }
// }

// public class RemoveDuplicatesinplacefromSortedArray {
//     public static void main(String[] args) {
//         int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

//         Solution sol = new Solution();
//         int k = sol.removeDuplicates(nums);

//         System.out.println("k = " + k); 
//         System.out.print("Array after removing duplicates: ");
//         for (int i = 0; i < k; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

// tc: O(n)
// sc: O(n)



//optimal soltuion ----

// Class to hold the solution logic
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

public class RemoveDuplicatesinplacefromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}
// tc: O(n)
// sc: O(1)