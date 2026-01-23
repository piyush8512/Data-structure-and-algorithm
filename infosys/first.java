import java.util.Scanner;

class first {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Number of terrain segments
        int n = s.nextInt();

        // Array to store sea levels
        int[] a = new int[n];

        // Read all sea levels
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // This will store the maximum digging required at any position
        // We use long to avoid overflow for large values
        long max_dig = 0;

        // Traverse from left to right
        for (int i = 0; i < n - 1; i++) {

            // If terrain is NOT strictly decreasing
            if (a[i] <= a[i + 1]) {

                // Minimum digging required to make:
                // a[i] > a[i+1]
                // So new a[i+1] should be a[i] - 1
                long required_dig = (long) a[i + 1] - a[i] + 1;

                // Keep track of maximum digging needed anywhere
                max_dig = Math.max(max_dig, required_dig);

                // Fix the terrain logically
                a[i + 1] = a[i] - 1;
            }
        }

        // If no digging is required at all
        if (max_dig == 0) {
            System.out.println(0);
            return;
        }

        // Now we calculate minimum number of days needed
        int days = 0;
        long power = 1; // Digging power on day 1

        // Increase days until power >= max_dig
        while (power < max_dig) {
            power *= 2;  // power doubles each day
            days++;
        }

        // Day count starts from day 1, so add 1
        System.out.println(days + 1);
    }
}
