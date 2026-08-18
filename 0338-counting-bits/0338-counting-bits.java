class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i=0;i<a.length;i++){
            int num=i;
            int count = 0;
            while(num>0){
                if((num&1) == 1){
                    count++;
                }
                num = num>>1;
            }
            a[i] = count;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna