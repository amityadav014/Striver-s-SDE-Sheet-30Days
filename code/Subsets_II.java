//problem link :https://leetcode.com/problems/subsets-ii/


public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }

    private void backtrack(List<List<Integer>> subsets, List<Integer> tempList, int[] nums, int start) {
        subsets.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            tempList.add(nums[i]);
            backtrack(subsets, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
}
