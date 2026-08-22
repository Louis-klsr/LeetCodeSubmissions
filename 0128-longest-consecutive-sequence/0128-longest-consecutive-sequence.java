class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            hs.add(n);
        }
        int l = 0 ;

        for (int n : hs) {

            if (!hs.contains(n - 1)) {
                int curr = n;
                int count = 1;
                while (hs.contains(curr + 1)) {
                    curr++;
                    count++;
            }   
            l = Math.max(l, count);
        }
    }
    return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna