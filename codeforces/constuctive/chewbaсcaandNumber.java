import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char[] digits = x.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i] - '0';
            if (i == 0 && digit == 9)
                continue;
            if (digit > 4)
                digits[i] = (char) ('0' + (9 - digit));
        }
        System.out.println(new String(digits));
    }
}

public class chewbaсcaandNumber {
    public static void main(String[] args) {
        Solution.main(args);
    }
}