import java.util.*;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
    }
}
// tc: O(n)
// sc: O(1)
