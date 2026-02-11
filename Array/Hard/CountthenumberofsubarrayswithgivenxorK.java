// // public class CountthenumberofsubarrayswithgivenxorK {

// // }

// class Solution {
//     public int countSubarraysXOR(int[] A, int B) {
//         int count = 0;
//         for (int i = 0; i < A.length; i++) {
//             int xorVal = 0;
//             for (int j = i; j < A.length; j++) {
//                 xorVal ^= A[j];
//                 if (xorVal == B) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int[] A = { 4, 2, 2, 6, 4 };
//         int B = 6;
//         Solution sol = new Solution();
//         System.out.println(sol.countSubarraysXOR(A, B));
//     }
// }

// // Time Complexity: O(N2),
// // Space Complexity: O(1)


//opitmal approach
import java.util.*;
class Solution {
    public int countSubarrays(int[] A, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        int prefixXor = 0;
        int count = 0;
        for (int num : A) {
            prefixXor ^= num;
            int target = prefixXor ^ k;
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }
}

public class CountthenumberofsubarrayswithgivenxorK {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int k = 6;
        Solution sol = new Solution();
        System.out.println(sol.countSubarrays(A, k));
    }
}
