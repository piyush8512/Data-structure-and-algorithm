
// import java.util.*;

// //brutetorce using hashmap
// class Solution {
//     public List<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
//         TreeMap<Integer, Integer> freq = new TreeMap<>();
//         for (int i = 0; i < n; i++)
//             freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
//         for (int i = 0; i < m; i++)
//             freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
//         List<Integer> Union = new ArrayList<>();
//         for (int key : freq.keySet())
//             Union.add(key);
//         return Union;
//     }
// }

// public class unionoftwosortedarray {
//     public static void main(String[] args) {
//         int n = 10;
//         int m = 7;
//         int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
//         Solution obj = new Solution();
//         List<Integer> Union = obj.FindUnion(arr1, arr2, n, m);
//         System.out.println("Union of arr1 and arr2 is ");
//         for (int val : Union)
//             System.out.print(val + " ");
//     }
// }

// // TC- Olog(n+m)
// // SC- O(n+m)




// //using set
// import java.util.*;
// class Solution {
//     public List<Integer> findUnion(int[] arr1, int[] arr2) {
//         Set<Integer> st = new TreeSet<>();
//         for (int num : arr1) {
//             st.add(num);
//         }
//         for (int num : arr2) {
//             st.add(num);
//         }
//         return new ArrayList<>(st);//notsorted
//     }
// }

// public class unionoftwosortedarray {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
//         Solution obj = new Solution();
//         List<Integer> result = obj.findUnion(arr1, arr2);
//         System.out.print("Union of arr1 and arr2 is: ");
//         for (int val : result) {
//             System.out.print(val + " ");
//         }
//     }
// }
// // TC- log(n+m)
// // SC- O(n+m)



import java.util.*;
class Solution {
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; 
            }
            else if (arr2[j] < arr1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
            else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;
            }
        }
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        // Return the union list
        return Union;
    }
}

public class unionoftwosortedarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        Solution obj = new Solution();
        List<Integer> result = obj.findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}

