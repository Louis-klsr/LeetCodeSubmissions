class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length ; i++ ) {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna