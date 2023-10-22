//problem lnk :



public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to store unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                // Found a new unique element, update the unique index and replace the element at that index
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // The uniqueIndex variable is 0-based, so the length of the unique elements would be (uniqueIndex + 1)
        return uniqueIndex + 1;
    }
}
