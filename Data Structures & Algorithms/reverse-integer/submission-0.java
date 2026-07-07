class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0) isNegative = true;
        if(isNegative) x = -1*x;

        long modifiedX = 0;
        while(x > 0) {
            int rem = x%10;
            x = x/10;
            modifiedX = modifiedX*10 + rem;
        }

        if(isNegative) {
            modifiedX = -1*modifiedX;
        }

        if(modifiedX > Math.pow(2, 31)-1 || modifiedX < -1*Math.pow(2, 31)) {
            return 0;
        }
        
        return (int)modifiedX;
    }
}