import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int index, List<Integer> subset) {
        result.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            helper(nums, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }
}
