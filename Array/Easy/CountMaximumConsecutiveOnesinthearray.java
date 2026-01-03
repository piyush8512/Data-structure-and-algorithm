class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
}

public class CountMaximumConsecutiveOnesinthearray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        Solution obj = new Solution();
        int ans = obj.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}
