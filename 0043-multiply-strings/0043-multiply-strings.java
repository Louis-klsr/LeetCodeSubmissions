class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return  "0";
        }
        int a = num1.length();
        int b = num2.length();
        int[] res = new int[a + b];
        for (int i = a - 1; i >= 0; i--) {
            for (int j = b - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                int ans = d1 * d2;
                int pos1 = i + j;
                int pos2 = i + j + 1;
                int sum = ans + res[pos2];
                res[pos2] = sum % 10;
                res[pos1] += sum / 10; 
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : res) {
            if (sb.length() == 0 && digit == 0){
                continue;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna