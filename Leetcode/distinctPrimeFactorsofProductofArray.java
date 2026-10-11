// package leetcode;

// public class distinctPrimeFactorsofProductofArray {
    
// }


//leetocde  2521
import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primes = new HashSet<>();

        for (int num : nums) {
            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    primes.add(i);
                    num /= i;
                }
            }
            if (num > 1)  primes.add(num);
        }
        return primes.size();
    }
}

public class distinctPrimeFactorsofProductofArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 4, 3, 9, 5};
        int result = solution.distinctPrimeFactors(nums);
        System.out.println(result); // Output: 3 (distinct prime factors are 2, 3, and 5)
    }
}

//tc O(n * √m) where n is the length of the array and m is the maximum number in the array
//sc O(1)