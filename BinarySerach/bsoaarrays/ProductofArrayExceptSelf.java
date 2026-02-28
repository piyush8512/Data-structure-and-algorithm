// // package BinarySerach.bsoaarrays;

// // public class ProductofArrayExceptSelf {
    
// // }

// class Solution {
//     public int[] productExceptSelf(int[] nums) {   
//         int n = nums.length;
//         int[] left = new int[n];
//         int[] right = new int[n];
//         int[] ans = new int[n];
//         left[0] = 1;
//         for (int i = 1; i < n; i++) {
//             left[i] = left[i - 1] * nums[i - 1];
//         }
//         right[n - 1] = 1;
//         for (int i = n - 2; i >= 0; i--) {
//             right[i] = right[i + 1] * nums[i + 1];
//         }
//         for (int i = 0; i < n; i++) {
//             ans[i] = left[i] * right[i];
//         }
//         return ans;
//     }
// }

// public class ProductofArrayExceptSelf {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4};
//         Solution s = new Solution();
//         int[] result = s.productExceptSelf(nums);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }


// //tc: O(n) sc: O(n)



//optimal solution 
class Solution {
    public int[] productExceptSelf(int[] nums) {  
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= nums[i];                           
        }
        
        return ans;
    }
}

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution s = new Solution();
        int[] result = s.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

//tc: O(n) sc: O(1)