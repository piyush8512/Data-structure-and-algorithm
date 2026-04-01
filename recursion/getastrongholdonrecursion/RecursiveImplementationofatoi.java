package getastrongholdonrecursion;
// package recursion;

// public class RecursiveImplementationofatoi {

// }

import Solution;

class Solution {
    static final int INT_MIN_VAL = -2147483648;
    static final int INT_MAX_VAL = 2147483647;

    static int helper(String s, int i, long num, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i)))
            return (int) (sign * num);
        num = num * 10 + (s.charAt(i) - '0');
        if (sign * num <= INT_MIN_VAL)
            return INT_MIN_VAL;
        if (sign * num >= INT_MAX_VAL)
            return INT_MAX_VAL;
        return helper(s, i + 1, num, sign);
    }

    static int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        return helper(s, i, 0, sign);
    }
}

public class RecursiveImplementationofatoi {
    public static void main(String[] args) {
        String s = "   -12345";
        System.out.println(Solution.myAtoi(s));
    }
}

//tc: O(n)
//sc: O(n) due to recursion stack