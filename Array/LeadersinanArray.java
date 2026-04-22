// package Array.Medium;

// import java.util.*;

// class Solution {

//     public ArrayList<Integer> leaders(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             boolean leader = true;

//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] >= nums[i]) {

//                     leader = false;
//                     break;
//                 }
//             }

//             if (leader) {
//                 ans.add(nums[i]);
//             }
//         }
//         return ans;
//     }
// }

// class LeadersinanArray {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 5, 3, 1, 2 };

//         Solution finder = new Solution();

//         ArrayList<Integer> ans = finder.leaders(nums);

//         System.out.print("Leaders in the array are: ");
//         for (int leader : ans) {
//             System.out.print(leader + " ");
//         }
//         System.out.println();
//     }
// }

// //on2 time complexity
// //o 1 space complexity

import java.util.*;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}

class LeadersinanArray {
    public static void main(String[] args) {
        int[] nums = { 10, 22, 12, 3, 0, 6 };
        Solution finder = new Solution();
        ArrayList<Integer> ans = finder.leaders(nums);
        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}

// O(n) time complexity
// O(1) space complexity (excluding output list)