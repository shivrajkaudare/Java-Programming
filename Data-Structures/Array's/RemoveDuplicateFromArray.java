// Remove Duplicates from a Sorted Array.
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle empty array
        }

        int i = 0; // Pointer for unique elements
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;            // Move to the next unique position
                nums[i] = nums[j]; // Update the position with the new unique value
            }
        }
        
        return i + 1; // Number of unique elements
    }
}
