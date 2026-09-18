import java.util.*;

class softDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//friends
        int k = sc.nextInt();//bottles
        int l = sc.nextInt();//ml per litter
        int c = sc.nextInt();//lime
        int d = sc.nextInt();//slice perlime
        int p = sc.nextInt();// salt
        int nl = sc.nextInt();//ml drinkgin per toaes
        int np = sc.nextInt();//g salt needed per toast 

        int drink = (k * l) / nl;
        int lime = c * d;
        int salt = p / np;
        int totalToasts = Math.min(drink, Math.min(lime, salt));
        int answer = totalToasts / n;
        System.out.println(answer);
    }
}