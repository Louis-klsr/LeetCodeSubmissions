class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while(left <= right) {
            int a = (left + right) / 2;
            int b = (m + n + 1) / 2 - a;
            
            int maxla = (a == 0)? Integer.MIN_VALUE : nums1[a - 1];
            int minra = (a == m)? Integer.MAX_VALUE : nums1[a];

            int maxlb = (b == 0)? Integer.MIN_VALUE: nums2[b - 1];
            int minrb = (b == n)? Integer.MAX_VALUE: nums2[b];

            if (maxla <= minrb && maxlb <= minra) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxla,maxlb) + Math.min(minra,minrb)) / 2.0;
                } else {
                    return Math.max(maxla,maxlb);
                }
            } else if (maxla > minrb){
                right = a - 1;
            } else {
                left = a + 1;
            }
        }
        return 0.0; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna