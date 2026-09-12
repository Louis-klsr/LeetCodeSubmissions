class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        if (digits.length() == 0) {
            return l;
        }
        String[] buttons = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        backtrack(digits, 0, "", l, buttons);
        return l;
    }
    public void backtrack(String digits, int index, String current, List<String> l, String[] buttons) {
        if (index == digits.length()) {
            l.add(current);
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = buttons[digit];
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            backtrack(digits, index + 1, current + letter, l, buttons);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna