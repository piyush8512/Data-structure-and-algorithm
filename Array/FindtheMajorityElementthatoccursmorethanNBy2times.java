
// //brute force approach
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int cnt = 0;
//             for (int j = 0; j < n; j++) {
//                 if (nums[j] == nums[i]) {
//                     cnt++;
//                 }
//             }
//             if (cnt > (n / 2)) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

// public class FindtheMajorityElementthatoccursmorethanNBy2times {
//     public static void main(String[] args) {
//         int[] arr = { 2, 2, 1, 1, 1, 1, 2, 2 };
//         Solution sol = new Solution();
//         int ans = sol.majorityElement(arr);
//         System.out.println("The majority element is: " + ans);
//     }

// }

// // tc 0(n^2)
// // sc 0(1)

// //better approach

// import java.util.*;
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }        
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n / 2) {
//                 return entry.getKey();
//             }
//         }
//         return -1;
//     }
// }

// public class FindtheMajorityElementthatoccursmorethanNBy2times {
//     public static void main(String[] args) {
//         int[] arr = { 2, 2, 1, 1, 1, 1, 2, };
//         Solution sol = new Solution();
//         int ans = sol.majorityElement(arr);
//         System.out.println("The majority element is: " + ans);
//     }

// }

// tc 0(n)
// sc 0(n)
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        if (cnt1 > (n / 2)) {
            return el;
        }
        return -1;
    }
}

// Separate Main class for execution
public class FindtheMajorityElementthatoccursmorethanNBy2times {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Call the majorityElement function
        int ans = sol.majorityElement(arr);

        // Print the majority element
        System.out.println("The majority element is: " + ans);
    }
}
