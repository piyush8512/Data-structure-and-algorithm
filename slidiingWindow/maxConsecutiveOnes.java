// public class maxConsecutiveOnes {
    
// }
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                }
                if (zeros > k) {
                    break;
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}

// Driver code
public class maxConsecutiveOnes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(sol.longestOnes(nums, k));
    }
}
