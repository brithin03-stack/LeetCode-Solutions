class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        helper(nums, new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, List<Integer> perm) {

        if (perm.size() == nums.length) {
            result.add(new ArrayList<>(perm));
            return;
        }

        for (int num : nums) {

            if (perm.contains(num))
                continue;

            perm.add(num);
            helper(nums, perm);
            perm.remove(perm.size() - 1);
        }
    }
}
