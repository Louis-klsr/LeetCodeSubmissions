class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        back(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }
    public void back(int[] candidates, int target, int start, List<Integer> curr, List<List<Integer>> res) {
        if (target ==0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            back(candidates, target-candidates[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna