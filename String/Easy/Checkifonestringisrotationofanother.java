// // public enum Checkifonestringisrotationofanother {
    
// // }



// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if (s.length() != goal.length()) {
//             return false;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             String rotated = s.substring(i) + s.substring(0, i);
//             if (rotated.equals(goal)) {
//                 return true;  
//             }
//         }
//         return false;
//     }
// }


// public class Checkifonestringisrotationofanother {
//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         String s1 = "rotation";
//         String goal1 = "tionrota";
//         System.out.println(sol.rotateString(s1, goal1)); 
//     }
// }

// // tc : O(n^2) sc : O(n)



//optmial solution
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);
    }
}

public class Checkifonestringisrotationofanother {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.rotateString("rotation", "tionrota"));
    }
}

// tc : O(n) sc : O(n)