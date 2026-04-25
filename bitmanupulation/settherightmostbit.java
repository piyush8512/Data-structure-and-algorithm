package bitmanupulation;
// public class settherightmostbit {
    
// }

class Solution {
    public static int setRightmostUnsetBit(int n) {
        return n | (n + 1);
    }
}

public class settherightmostbit {
    public static void main(String[] args) {
        int n = 2;
        int result = Solution.setRightmostUnsetBit(n);
        System.out.println("Number after setting rightmost unset bit: " + result); // Output: 11
    }
}


//o(1`) time complexity and o(1) space complexity