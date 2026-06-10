// public class maximumTotalSubarrayValueI {
    
// }



class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int p = i; p <= j; p++) {
                    max = Math.max(max, nums[p]);
                    min = Math.min(min, nums[p]);
                }
                best = Math.max(best, max - min);
            }
        }
        return best * k;
    }
}