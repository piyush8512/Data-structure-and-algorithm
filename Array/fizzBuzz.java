
//* Fizz Buzz | infosys
import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}

public class fizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        List<String> result = solution.fizzBuzz(n);
        for (String str : result) {
            System.out.println(str);
        }
    }
}

// tc: O(n)
// sc: O(n)