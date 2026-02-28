package leetcode;

// public class 1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {

// }
// import java.util.*;
// //1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K
// public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion {
//     public boolean hasAllCodes(String s, int k) {
//         Set<String> set = new HashSet<>();

//         for (int i = 0; i <= s.length() - k; i++) {
//             String sub = s.substring(i, i + k);
//             set.add(sub);
//         }

//         return set.size() == (1 << k); // 2^k
//     }

//     public static void main(String[] args) {
//         Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion sol = new Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion();
//         String s = "00110110";
//         int k = 2;
//         boolean result = sol.hasAllCodes(s, k);
//         System.out.println("Does the string contain all binary codes of size " + k + "? " + result);
//     }
// }

// // Time Complexity: O(N * K) where N is the length of the string and K is the size of the binary codes.
// // Space Complexity: O(2^K) for the HashSet storing all possible binary codes

//optimal code bit manupulation

public class Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion {
    public boolean hasAllCodes(String s, int k) {
        int total = 1 << k; 
        int need = total; 
        boolean[] seen = new boolean[total];
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = ((hash << 1) & (total - 1)) | (s.charAt(i) - '0');
            if (i >= k - 1 && !seen[hash]) {
                seen[hash] = true;
                need--;
                if (need == 0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion sol = new Check_If_a_String_Contains_All_Binary_Codes_of_Size_Ktion();
        String s = "00110110";
        int k = 2;
        boolean result = sol.hasAllCodes(s, k);
        System.out.println("Does the string contain all binary codes of size " + k + "? " + result);
    }
}
