// public class IsomorphicString {
    
// }


class Solution {
      public boolean isomorphicString(String s, String t) {
          int[] m1 = new int[256], m2 = new int[256];
          int n = s.length();
          for (int i = 0; i < n; ++i) {
              if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
              m1[s.charAt(i)] = i + 1;
              m2[t.charAt(i)] = i + 1;
          }
          return true;
      }
  }
  
  public class IsomorphicString {
      public static void main(String[] args) {
          Solution solution = new Solution();
          String s = "paper";
          String t = "title";
          if (solution.isomorphicString(s, t)) {
              System.out.println("Strings are isomorphic.");
          } else {
              System.out.println("Strings are not isomorphic.");
          }
      }
  }
  // Time Complexity: O(n) where n is the length of the strings
  // Space Complexity: O(1) since the size of the character set is fixed (