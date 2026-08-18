class Solution {
    public boolean checkRecord(String s) {
       int late = 0;
       int abs = 0;
       for (int i = 0; i < s.length() ;i++ ) {
        if (s.charAt(i) == 'A') {
            abs++;
            late = 0;
        }
        else if (s.charAt(i) == 'L') {
            late++;
        }
        else {
            late = 0;
        }
        if (abs >= 2 || late >= 3){
            return false;
        }
       }
       return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna