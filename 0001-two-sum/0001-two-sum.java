class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length ; i++){
            for (int j = i+1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            else {
                
            }
        }
        
    }
    return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna