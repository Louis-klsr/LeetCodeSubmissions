class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int j = 0 ; j < nums.length ; j++) {
            if (nums[j] != val) {
                nums[ans] = nums[j];
                ans++;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna