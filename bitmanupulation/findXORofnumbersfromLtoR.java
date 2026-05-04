// // public class findXORofnumbersfromLtoR {
    
// // }


// class Solution {
//     public int findRangeXOR(int l, int r) {
//         int ans = 0;
//         for (int i = l; i <= r; i++) {
//             ans ^= i;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int l = 3, r = 5;
//         Solution sol = new Solution();
//         int ans = sol.findRangeXOR(l, r);  
//         System.out.println("The XOR of numbers from " + l + " to " + r + " is: " + ans);
//     }
// }

// // Time Complexity: O(n) where n is the number of integers from l to r
// // Space Complexity: O(1)


public class findXORofnumbersfromLtoR {
    private int XORtillN(int n) {
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        return n;
    }
    
    public int findRangeXOR(int l, int r) {
        return XORtillN(l - 1) ^ XORtillN(r);
    }
    
    public static void main(String[] args) {
        int l = 3, r = 5;
        findXORofnumbersfromLtoR sol = new findXORofnumbersfromLtoR(); 
        int ans = sol.findRangeXOR(l, r);
        System.out.println("The XOR of numbers from " + l + " to " + r + " is: " + ans);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
