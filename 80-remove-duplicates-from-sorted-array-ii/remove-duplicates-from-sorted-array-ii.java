class Solution {
    public int removeDuplicates(int[] nums) {
         int i = 0; // Pointer for placing the next unique element
        int count = 1; // Counter for occurrences of each element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                if (count < 2) {
                    nums[++i] = nums[j];
                }
                count++;
            } else {
                nums[++i] = nums[j];
                count = 1; // Reset count for the new element
            }
        }
        return i + 1;
    }
}