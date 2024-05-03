import java.util.*;

public class SumOfSubset {

    public static void findSubsetSum(int[] set, int target) {
        List<Integer> subset = new ArrayList<>();
        backtrack(set, target, 0, subset, 0);
    }

    private static void backtrack(int[] set, int target, int sum, List<Integer> subset, int start) {
        if (sum == target) {
            System.out.println("Subset found: " + subset);
            return;
        }

        for (int i = start; i < set.length; i++) {
            if (sum + set[i] <= target) {
                subset.add(set[i]);
                backtrack(set, target, sum + set[i], subset, i + 1);
                subset.remove(subset.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] set = {10, 7, 5, 18, 12, 20, 15};
        int target = 35;

        System.out.println("Subsets with sum equal to " + target + ":");
        findSubsetSum(set, target);
    }
}

