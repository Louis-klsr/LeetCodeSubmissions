class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        int carry = 0;
        while ( b!=0 ) {
            sum =  a ^ b;
            carry = a & b;
            carry = carry << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna