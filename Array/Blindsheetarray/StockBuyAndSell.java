// package Array.Blindsheetarray;

// // public class StockBuyAndSell {
    
// // }
// class Solution {
//     public int stockbuySell(int[] prices) {
//         int maxProfit = 0;
//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 int profit = prices[j] - prices[i];
//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }
//         return maxProfit;
//     }
// }


// class StockBuyAndSell {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] prices = {7, 1, 5, 3, 6, 4};
//         System.out.println("Max Profit: " + sol.stockbuySell(prices));
//     }
// }

// // Time Complexity: O(n^2) - We have two nested loops, each iterating through the array.
// // Space Complexity: O(1) - We are using a constant amount of space to store


class Solution {
    public int stockbuySell(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(obj.stockbuySell(prices));
    }
}
  