package bitmanupulation.learnbitmanypulation;

// public class checkifanumberisoddornot {
    
// }

class Solution {
    public boolean isOdd(int n) {
        return n % 2 != 0;  
    }
}

public class checkifanumberisoddornot {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 7;

        if (sol.isOdd(num)) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is not odd.");
        }
    }
}

// tc: O(1) sc: O(1)