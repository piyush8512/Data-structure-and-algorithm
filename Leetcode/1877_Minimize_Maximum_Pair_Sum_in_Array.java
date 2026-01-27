import java.util.Arrays;

public class Solution {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int pairSum = nums[left] + nums[right];
            maxSum = Math.max(maxSum, pairSum);
            left++;
            right--;
        }
        return maxSum;
    }

    public static void 1877_Minimize_Maximum_Pair_Sum_in_Array(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 5, 2, 3};
        System.out.println("Test 1: " + solution.minPairSum(nums1)); // 7

        int[] nums2 = {3, 5, 4, 2, 4, 6};
        System.out.println("Test 2: " + solution.minPairSum(nums2)); // 8
    }
}
