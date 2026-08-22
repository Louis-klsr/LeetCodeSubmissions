class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        } 
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int n : hm.keySet()) {
            int freq = hm.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        int[] res = new int[k];
        int index = 0;
        for (int freq = bucket.length - 1; freq >= 0 && index < k; freq-- ) {
            if (bucket[freq] != null) {
                for (int n : bucket[freq]) {
                    res[index] = n;
                    index++;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return res;
     }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna