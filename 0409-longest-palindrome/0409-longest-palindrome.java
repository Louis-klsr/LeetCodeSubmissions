class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray()) {
            count[c]++;
        }
        int l = 0;
        boolean odd = false;

        for (int freq : count) {
            l += (freq / 2) * 2;
            if (freq % 2 == 1) {
                odd = true;
            }
        }
        if (odd) {
            l++;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna