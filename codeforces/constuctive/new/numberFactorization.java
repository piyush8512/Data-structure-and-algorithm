// package new;

// public class numberFactorization {

// }

//codeforces  1787B
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            // Store prime factors and their exponents
            List<Long> primes = new ArrayList<>();
            List<Integer> powers = new ArrayList<>();

            long temp = n;
            // Factorization
            for (long i = 2; i * i <= temp; i++) {
                if (temp % i == 0) {
                    int count = 0;
                    while (temp % i == 0) {
                        temp /= i;
                        count++;
                    }
                    primes.add(i);
                    powers.add(count);
                }
            }

            // Remaining prime factor
            if (temp > 1) {
                primes.add(temp);
                powers.add(1);
            }

            // Find maximum exponent
            int maxPower = 0;

            for (int power : powers) {
                maxPower = Math.max(maxPower, power);
            }

            long answer = 0;

            // For every exponent level
            for (int level = 1; level <= maxPower; level++) {

                long product = 1;

                for (int i = 0; i < primes.size(); i++) {
                    if (powers.get(i) >= level) {
                        product *= primes.get(i);
                    }
                }
                answer += product;
            }

            System.out.println(answer);
        }
    }
}

public class numberFactorization {
    public static void main(String[] args) {
        Solution.main(args);
    }
}
// exmaple input
// 7
// 100
// 10
// 864
// 130056192
// 1000000000
// 2
// 999999018

// tc O(√n + k * m) where k is the number of distinct prime factors and m is the
// maximum exponent
// sc O(k) where k is the number of distinct prime factors