// // package bitmanupulation;

// // public class dividetwointegerswithoutusingmultiplicationdivisionandmodoperator {
    
// // }


// //brute force approach
// class Solution {
//     public int divide(int dividend, int divisor) {
        
//         if(dividend == divisor) return 1;
//         if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
//         if(divisor == 1) return dividend;
//         boolean isPositive = true;
//         if(dividend >= 0 && divisor < 0) 
//             isPositive = false;
//         else if(dividend < 0 && divisor > 0)
//             isPositive = false;
//         long n = dividend;
//         long d = divisor;

//         n = Math.abs(n);
//         d = Math.abs(d);
        
//         long ans = 0, sum = 0;
        
//         while(sum + d <= n) {
//             ans++;
//             sum += d;
//         }

//         if(ans > Integer.MAX_VALUE && isPositive) 
//             return Integer.MAX_VALUE;
//         if(ans > Integer.MAX_VALUE && !isPositive)
//             return Integer.MIN_VALUE;
        
//         return isPositive ? (int)ans : (int)(-1 * ans);
//     }
// }

// public class dividetwointegerswithoutusingmultiplicationdivisionandmodoperator {
//     public static void main(String[] args) {
//         int dividend = 10, divisor = 3;
//         Solution sol = new Solution(); 
//         int ans = sol.divide(dividend, divisor);
//         System.out.println("The result of dividing " + dividend + " and " + divisor + " is " + ans);
//     }
// }



// //tc o(n) sc o(1)




class Solution {
    public int divide(int dividend, int divisor) {

        // Edge cases
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Determine sign
        boolean isPositive = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            long temp = d;
            long multiple = 1;

            // Find largest multiple using bit shift
            while (n >= (temp << 1)) {
                temp <<= 1;       // temp = temp * 2
                multiple <<= 1;   // multiple = multiple * 2
            }

            n -= temp;
            ans += multiple;
        }

        // Apply sign
        if (!isPositive) ans = -ans;

        // Handle overflow
        if (ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) ans;
    }
}

