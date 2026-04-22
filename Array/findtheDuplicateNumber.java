// package Array.lovebabbar;

// public class findtheDuplicateNumber {
    
// }


//bruteforrce approach
// class Solution {
//     public int findDuplicate(int[] nums) {
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i + 1; j < nums.length; j++){
//                 if ( nums[i] == nums[j] ) return nums[i];
//             }
//         }
//          return -1;
// }
// }

//tc: O(n^2) sc: O(1)


//sorted array approach
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for ( int i = 1; i < nums.length; i++){
//             if (nums[i] == nums[i+1]) return nums[i];
//         }return -1;
//     }
// }
// //tc: O(nlogn) sc: O(1)

//hashset approach
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         for (int num : nums){
//             if (set.contains(num)) return num;
//             set.add(num);
//         }
//         return -1;

//     }
// }
//tc: O(n) sc: O(n) - in worst case, all numbers are unique except one duplicate, so we store n-1 unique numbers in the set.


// //binary search approach
// class Solution {
//     public int findDuplicate(int[] nums) {
//        int low = 1, high = nums.length - 1;

//         while (low < high) {
//             int mid = (low + high) / 2;

//             int count = 0;
//             for (int num : nums) {
//                 if (num <= mid) count++;
//             }

//             if (count > mid) {
//                 high = mid;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return low;

//     }
// }
// //tc: O(nlogn) - we perform a binary search which takes O(logn) and for each mid value, we count how many numbers are less than or equal to mid, which takes O(n).
// //sc: O(1) - we only use a constant amount of extra space for the


//floyd's tortoise and hare approach
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        slow = nums[0];
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
//tc: O(n) - in the worst case, we might have to traverse the array multiple times, but it will still be linear.
//sc: O(1) - we only use a constant amount of extra space for the