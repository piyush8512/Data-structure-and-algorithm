// package heap;

// public class checkifanarrayrepresentsaminheap {
    
// }
class Solution {
    public boolean isMinHeap(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= (n / 2) - 1; i++) {
            int left = 2 * i + 1;
            if (left < n && nums[i] > nums[left]) {
                return false;
            }
            int right = 2 * i + 2;
            if (right < n && nums[i] > nums[right]) {
                return false;
            }
        }
        return true;
    }
}
public class checkifanarrayrepresentsaminheap {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {10, 20, 30, 21, 23};
        boolean output = obj.isMinHeap(nums);
        System.out.println(output ? "true" : "false");
    }
}


//tc: O(n)
//sc: O(1)