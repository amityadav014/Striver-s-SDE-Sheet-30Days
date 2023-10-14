//problem link:https://leetcode.com/problems/longest-consecutive-sequence/description/

class Solution{
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestSequence = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestSequence = Math.max(longestSequence, currentStreak);
            }
        }

        return longestSequence;
    }
}