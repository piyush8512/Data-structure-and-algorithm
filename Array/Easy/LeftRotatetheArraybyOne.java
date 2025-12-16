package Array.Easy;

///leetcode 189 Left Rotate the Array by One
/// bruteforce approach using temporary array
// class Solution {
//     public static void solve(int[] arr, int n) {
//         int[] temp = new int[n]; 
//         for (int i = 1; i < n; i++) {
//             temp[i - 1] = arr[i];
//         }
//         temp[n - 1] = arr[0]; 
       
//         for (int i = 0; i < n; i++) {
//             System.out.print(temp[i] + " ");
//         }
//         System.out.println();
//     }
// }


// public class LeftRotatetheArraybyOne {
//     public static void main(String[] args) {
//         int n = 5;  
//         int[] arr = {1, 2, 3, 4, 5};  

//         Solution.solve(arr, n);  
//     }
// }

// tc: O(n)
// sc: O(n)


//optimal solution ----
// Class to hold the solution logic
class Solution {
    public void rotateArrayByOne(int[] nums) {    
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }
}

public class LeftRotatetheArraybyOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// tc: O(n)
// sc: O(1)