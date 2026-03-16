// // public class CheckiftwoStringsareanagramsofeachother {

// // }

// // Solution class to check if two strings are anagrams
// public class Solution {

//     // Function to check if two strings are anagrams
//     public static boolean CheckAnagrams(String str1, String str2) {
//         if (str1.length() != str2.length()) {
//             return false; 
//         }
//         char[] charArray1 = str1.toCharArray();
//         char[] charArray2 = str2.toCharArray();
//         java.util.Arrays.sort(charArray1);
//         java.util.Arrays.sort(charArray2);
//         for (int i = 0; i < str1.length(); i++) {
//             if (charArray1[i] != charArray2[i]) {
//                 return false; 
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String Str1 = "INTEGER";
//         String Str2 = "TEGERNI";
//         if (CheckAnagrams(Str1, Str2)) {
//             System.out.println("True"); 
//         } else {
//             System.out.println("False"); 
//         }
//     }
// }
// // Time Complexity: O(n log n) due to sorting the character arrays, where n is the length of the strings.
// // Space Complexity: O(1) for storing the character arrays, where n is the length of the strings.

//optmial approach
// Solution class to check if two strings are anagrams
class CheckiftwoStringsareanagramsofeachother {
    public boolean CheckAnagrams(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public class Main {
        public static void main(String[] args) {
            CheckiftwoStringsareanagramsofeachother solution = new CheckiftwoStringsareanagramsofeachother();
            String Str1 = "INTEGER";
            String Str2 = "TEGERNI";
            if (solution.CheckAnagrams(Str1, Str2))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

}

// Time Complexity: O(n) where n is the length of the strings, as we traverse both strings once to count character frequencies.
// Space Complexity: O(1) since the frequency array has a fixed size of 26