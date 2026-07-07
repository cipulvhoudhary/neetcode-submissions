class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNumber = 0;
        for(int num : nums) {
            missingNumber ^= num;
        }
        for(int i=0; i<=n; i++) {
            missingNumber ^= i;
        }
        return missingNumber;
    }
}