// package leetcode;

// public class sumofSquaresofSpecialElements {
    
// }

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int value = nums[i - 1];
                sum += value * value;
            }
        }
        return sum;
    }
}

public class sumofSquaresofSpecialElements {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int result = solution.sumOfSquares(nums);
        System.out.println(result); // Output: 5
    }
}

//tc O(n) where n is the length of the array
// sc O(1) since we are using a constant amount of space