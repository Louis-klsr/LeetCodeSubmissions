class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                return num;
            }
            hs.add(num);
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna