class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        long[] prodL = new long[n];
        long[] prodR = new long[n];

        int[] res = new int[n];

        prodL[0] = nums[0];
        for(int i=1; i<n; i++) {
            prodL[i] = nums[i] * prodL[i-1];
        }

        prodR[n-1] = nums[n-1];
        for(int i=n-2; i>=0 ; i--) {
            prodR[i] = nums[i] * prodR[i+1];
        }
        
        res[0] = (int)prodR[1];
        res[n-1] = (int)prodL[n-2];

        for(int i=1; i<n-1; i++) {
            res[i] = (int)(prodL[i-1] * prodR[i+1]);
        }

        return res;
    }
}  
