// // public class maximumandminimumofanarrayusingminimumnumberofcomparisons {

// // }

// import java.util.ArrayList;
// import java.util.Collections;

// public class maximumandminimumofanarrayusingminimumnumberofcomparisons {
//     public static ArrayList<Integer> findMinMax(int[] arr){
//         ArrayList<Integer> sortedArr = new ArrayList<>();
//         for( int num : arr){
//             sortedArr.add(num);
//         }
//         Collections.sort(sortedArr);
//         ArrayList<Integer> result = new ArrayList<>();
//         result.add(sortedArr.get(0));
//         result.add(sortedArr.get(sortedArr.size() - 1));
//         return result;
//     }

//     public static void main(String[] args){
//         int[] arr = {3,5,4,1,9};
//         ArrayList<Integer>  result = findMinMax(arr);
//         System.out.println(result.get(0) + " " + result.get(1));

//     }

// }

// //tc O(n log n)  and  sc o(1)

//better approach
import java.util.ArrayList;

public class maximumandminimumofanarrayusingminimumnumberofcomparisons {
    public static ArrayList<Integer> findMinMax(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < mini)
                mini = num;
            if (num > maxi)
                maxi = num;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(mini);
        result.add(maxi);
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 9 };
        ArrayList<Integer> result = findMinMax(arr);
        System.out.println(result.get(0) + " " + result.get(1));

    }
}

//tc o (n)  and sc  o(1)