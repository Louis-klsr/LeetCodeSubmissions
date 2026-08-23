class Solution {
    public char findTheDifference(String s, String t) {
       char res = 0;
       for (char c : s.toCharArray()) {
        res ^= c;
       }
       for (char c : t.toCharArray()){
        res ^= c;
       }
       return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna