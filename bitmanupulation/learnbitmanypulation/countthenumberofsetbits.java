// package bitmanupulation.learnbitmanypulation;

// public class countthenumberofsetbits {

// }

// Solution class containing the countSetBits function
class Solution {
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public int countSetBitssecond(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
} 

// Main class to test the Solution class
public class countthenumberofsetbits {
    public static void main(String[] args) {
        int n = 29;
        Solution sol = new Solution();
        int result = sol.countSetBits(n);
        int result2 = sol.countSetBitssecond(n);
        System.out.println("The number of set bits is: " + result);
        System.out.println("The number of set bits (second method) is: " + result2);
    }
}