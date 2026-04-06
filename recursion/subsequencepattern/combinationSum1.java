// public class combinationSum1 {

// }

import java.util.*;

class Solution {

    public void findCombination(int ind, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombination(ind, target - arr[ind], arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind + 1, target, arr, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombination(0, target, candidates, ans, ds);
        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] v = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> ans = obj.combinationSum(v, target);

        System.out.println("Combinations are: ");
        for (List<Integer> combination : ans) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// Time Complexity: O(2^t * k) where t is the target and k is the average length
// of combinations.