// package Array.Medium;

// // Sortanarrayof0s,1sand2s.java

// class Solution {
//     public void sortZeroOneTwo(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
//         for (int num : nums) {
//             if (num == 0)
//                 count0++;
//             else if (num == 1)
//                 count1++;
//             else
//                 count2++;
//         }
//         int index = 0;
//         System.out.print(count0);
//         while (count0-- > 0) {
//             nums[index++] = 0;
//         }
//         System.out.print(count1);
//         while (count1-- > 0) {
//             nums[index++] = 1;
//         }
//         System.out.print(count2);
//         while (count2-- > 0) {
//             nums[index++] = 2;
//         }
//     }
// }

// public class Sortanarrayof0s1sand2s {
//     public static  void main(String[] args){
//         int[] nums = {1, 0, 2, 1, 0};
//         Solution obj = new Solution();
//         obj.sortZeroOneTwo(nums);
//         for(int num : nums ){
//             System.out.print(" " + num + " ");

//         }
//     }

// }
// // tc 0(n)
// //sc 0(1)

//------ better

// class Solution {
//     public void sortZeroOneTwo(int[] nums) {
//         int cnt0 = 0, cnt1 = 0, cnt2 = 0;
//         for (int num : nums) {
//             if (num == 0)
//                 cnt0++;
//             else if (num == 1)
//                 cnt1++;
//             else
//                 cnt2++;
//         }
//         for (int i = 0; i < cnt0; i++) {
//             nums[i] = 0;
//         }
//         for (int i = cnt0; i < cnt0 + cnt1; i++) {
//             nums[i] = 1;
//         }
//         for (int i = cnt0 + cnt1; i < nums.length; i++) {
//             nums[i] = 2;
//         }

//     }

// }

// public class Sortanarrayof0s1sand2s {
//     public static void main(String[] args) {
//         int[] nums = { 0, 2, 1, 2, 0, 1 };

//         Solution sol = new Solution();
//         sol.sortZeroOneTwo(nums);

//         System.out.println("After sorting:");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }

// }

// // tc: O(n)
// // sc: O(1)

//optima l approach Dutch national flag algorithm threr pointer 

class Solution {
    public void sortZeroOneTwo(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

public class Sortanarrayof0s1sand2s {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        obj.sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
