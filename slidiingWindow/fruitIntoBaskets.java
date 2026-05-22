// // // // public class fruitIntoBaskets {
    
// // // // }


// // // //bruteforece approach
// // // import java.util.*;

// // // class Solution {
// // //     public int totalFruit(int[] fruits) {
// // //         int maxFruits = 0;
// // //         for (int start = 0; start < fruits.length; ++start) {
// // //             Map<Integer, Integer> basket = new HashMap<>();
// // //             int currentCount = 0;
// // //             for (int end = start; end < fruits.length; ++end) {
// // //                 basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);
// // //                 if (basket.size() > 2) {
// // //                     break;
// // //                 }
// // //                 currentCount++;
// // //             }
// // //             maxFruits = Math.max(maxFruits, currentCount);
// // //         }
// // //         return maxFruits;
// // //     }
// // // }

// // // public class fruitIntoBaskets {
// // //     public static void main(String[] args) {
// // //         Solution obj = new Solution();
// // //         int[] fruits = {1, 2, 1};
// // //         System.out.println(obj.totalFruit(fruits));
// // //     }
// // // }

// // //BETTER SOLUTION
// // import java.util.*;

// // class Solution {
// //     public int totalFruit(int[] fruits) {
// //         Map<Integer, Integer> basket = new HashMap<>();
// //         int left = 0;
// //         int maxFruits = 0;
// //         for (int right = 0; right < fruits.length; right++) {
// //             basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
// //             while (basket.size() > 2) {
// //                 basket.put(fruits[left], basket.get(fruits[left]) - 1);
// //                 if (basket.get(fruits[left]) == 0) {
// //                     basket.remove(fruits[left]);
// //                 }
// //                 left++;
// //             }
// //             maxFruits = Math.max(maxFruits, right - left + 1);
// //         }
// //         return maxFruits;
// //     }
// // }

// // // Driver code
// // public class fruitIntoBaskets {
// //     public static void main(String[] args) {
// //         Solution obj = new Solution();
// //         int[] fruits = {1, 2, 1, 2, 3};
// //         System.out.println(obj.totalFruit(fruits));
// //     }
// // }

// //TC: O(n) where n is the number of fruits
// //SC: O(1) since the basket can only hold 2 types of fruits, the space used by the hashmap is constant




// //OPTMIAL SOLUTION

// class Solution {
//     public int totalFruit(int[] fruits) {
//         int maxlen = 0;
//         int lastFruit = -1, secondLastFruit = -1;
//         int currCount = 0, lastFruitStreak = 0;
//         for (int fruit : fruits) {            
//             if (fruit == lastFruit || fruit == secondLastFruit) {
//                 currCount++;
//             } else {
//                 currCount = lastFruitStreak + 1;
//             }
//             if (fruit == lastFruit) {
//                 lastFruitStreak++;
//             } else {
//                 lastFruitStreak = 1;
//                 secondLastFruit = lastFruit;
//                 lastFruit = fruit;
//             }
//             maxlen = Math.max(maxlen, currCount);
//         }
//         return maxlen;
//     }
// }

// public class fruitIntoBaskets {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] fruits = {1,2,1,2,3};
//         System.out.println(sol.totalFruit(fruits));
//     }
// }
// //TC: O(n)
// //SC: O(1)