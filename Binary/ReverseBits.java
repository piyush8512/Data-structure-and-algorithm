class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;        
            result |= (n & 1);   
            n >>= 1;  
        }

        return result;
    }
}

public class ReverseBits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 43261596; 
        int reversed = sol.reverseBits(n);
        System.out.println("Reversed bits: " + reversed);
    }
}