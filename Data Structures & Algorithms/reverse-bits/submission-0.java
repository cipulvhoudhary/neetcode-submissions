class Solution {
    private boolean isSetBit(int n, int x) {
        return ((n >> x) & 1) == 1;
    }

    public int reverseBits(int n) {
        int i=0, j=31;
        while(i < j) {
            boolean isIthBitSet = isSetBit(n, i);
            boolean isJthBitSet = isSetBit(n, j);

            if(isIthBitSet != isJthBitSet) {
                n ^= (1<<i);
                n ^= (1<<j);
            }

            i++;
            j--;
        }
        return n;
    }
}