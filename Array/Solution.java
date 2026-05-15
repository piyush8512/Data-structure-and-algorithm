// // public class commonElements {
    
// // }

// import java.util.*;

// public class Solution {
//     public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {

//         HashSet<Integer> set1 = new HashSet<>();
//         HashSet<Integer> set2 = new HashSet<>();
//         ArrayList<Integer> result = new ArrayList<>();

//         for (int num : a) set1.add(num);

//         for (int num : b) {
//             if (set1.contains(num)) {
//                 set2.add(num);
//             }
//         }

//         for (int num : c) {
//             if (set2.contains(num)) {
//                 result.add(num);
//                 set2.remove(num);
//             }
//         }

//         Collections.sort(result);
//         return result;
//     }
// }


// //tc: O(n1 + n2 + n3) where n1, n2, and n3 are the lengths of the three arrays
// //sc: O(n1 + n2) for the hash sets, O(k) for



//optmjcal apprach 
import java.util.*;

class commonElements {
    public ArrayList<Integer> commonElementsa(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length && k < c.length) {

            if (a[i] == b[j] && b[j] == c[k]) {
                if (result.isEmpty() || result.get(result.size()-1) != a[i]) {vjfgj
                    result.add(a[i]);
                }
                i++; j++; k++;
            } 
            else if (a[i] < b[j]) {
                i++;
            } 
            else if (b[j] < c[k]) {
                j++;
            } 
            else {
                k++;
            }
        }

        return result;
    }
}

// Time Complexity: O(n1 + n2 + n3) where n1, n2, and n3 are the lengths of the three arrays
// Space Complexity: O(k) where k is the number of common elements found in the three