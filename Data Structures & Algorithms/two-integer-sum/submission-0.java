class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                if(ans[0] > ans[1]) {
                    int temp = ans[0];
                    ans[0] = ans[1];
                    ans[1] = temp;
                }
                return ans;
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}
