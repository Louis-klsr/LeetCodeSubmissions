class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm = new HashSet<>();
        for (int n : nums1) {
            hm.add(n);
        }
        HashSet<Integer> res = new HashSet<>();

        for (int n : nums2) {
            if (hm.contains(n)) {
                res.add(n);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (int n : res) {
            result[i] = n;
            i++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna