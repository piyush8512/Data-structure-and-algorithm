package Array.Easy.Leetcode;


// 1752 leetocde
public class CheckifArrayIsSortedandRotated {
    class Solution {
        public boolean check(int[] nums) {
            int count = 0;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                // moduluforlastelement
                if (nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
                if (count > 1) {
                    return false;
                }
            }
            return true;
        }
    }

}
