// public class CountGoodnumbers {
    
// }


public class CountGoodnumbers {
    static final int MOD = 1_000_000_007;
    
    // Recursive function to count good numbers
    public static int countGoodNumbers(int index, int n) {
        if (index == n) {  
            return 1;
        }
        int result = 0;
        if (index % 2 == 0) {  
            int[] evenDigits = {0, 2, 4, 6, 8};
            for (int digit : evenDigits) {
                result = (result + countGoodNumbers(index + 1, n)) % MOD;
            }
        } 
        else {  
            int[] primeDigits = {2, 3, 5, 7};
            for (int digit : primeDigits) {
                result = (result + countGoodNumbers(index + 1, n)) % MOD;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 1;
        System.out.println(countGoodNumbers(0, n));
    }
}
