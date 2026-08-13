class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String words[] = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i>= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna