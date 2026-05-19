// public class fruitIntoBaskets {
    
// }


//bruteforece approach
import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        for (int start = 0; start < fruits.length; ++start) {
            Map<Integer, Integer> basket = new HashMap<>();
            int currentCount = 0;
            for (int end = start; end < fruits.length; ++end) {
                basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);
                if (basket.size() > 2) {
                    break;
                }
                currentCount++;
            }
            maxFruits = Math.max(maxFruits, currentCount);
        }
        return maxFruits;
    }
}

public class fruitIntoBaskets {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] fruits = {1, 2, 1};
        System.out.println(obj.totalFruit(fruits));
    }
}
