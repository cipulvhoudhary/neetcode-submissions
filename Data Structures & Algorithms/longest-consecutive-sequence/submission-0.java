class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if(n == 0) return 0;

        int maxLen = 1;
        int i=0;
        while(i < n) {
            int len = 1;
            int j=i;
            while(j+1<n && (nums[j+1]-nums[j] == 0 || nums[j+1]-nums[j] == 1)) {
                if(nums[j+1]-nums[j] == 1) {
                    len++;
                }
                j++;
            }
            i = j+1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
