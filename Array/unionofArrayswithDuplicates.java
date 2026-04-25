// public class unionofArrayswithDuplicates {
    
// }

import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}

//tc: O(n + m) where n and m are the sizes of the two input arrays
//sc: O(n + m) in the worst case when all elements are unique across both