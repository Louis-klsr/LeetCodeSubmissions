class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int left = 0;
        int right = 0;
        int req = t.length();
        int minlen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (count[c] > 0) {
                req--;
            }
            count[c]--;
            right++;
            while (req == 0) {
                if (right - left < minlen) {
                    minlen = right - left;
                    start = left;
                }
                char leftc = s.charAt(left);
                count[leftc]++;
                if (count[leftc] > 0) {
                    req++;
                }
                left++;
            }
        } 
        if (minlen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minlen);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna