class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i = 1; i < strs.length ;i++) {
            while (!strs[i].startsWith(res)){
                res = res.substring(0, res.length() - 1);
                if (res.isEmpty()) {
                    return "";
                }
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna