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
}
