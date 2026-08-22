class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] le = s.split(" ");

        if (pattern.length() != le.length) {
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();
        HashMap<String, Character> hm1 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String le1 = le[i];
            if (hm.containsKey(c) && !hm.get(c).equals(le1)) {
                return false;
            }
            if (hm1.containsKey(le1) && hm1.get(le1) != c) {
                return false;
            }
            hm.put(c, le1);
            hm1.put(le1, c);
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna