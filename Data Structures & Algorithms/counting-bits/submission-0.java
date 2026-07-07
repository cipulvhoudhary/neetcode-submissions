class Solution {
    public int hammingWeight(int n) {
        int numSetBits = 0;
        for(int i=0; i<31; i++) {
            if(((n>>i) & 1) == 1) {
                numSetBits++;
            }
        }
        return numSetBits;
    }

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        
        for(int i=0; i<=n; i++) {
            res[i] = hammingWeight(i);
        }

        return res;
    }
}
