class Solution {
    public int dominantIndex(int[] nums) {
        int index = -1, max = -1, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
        return (max >= nums[n-2] * 2 ? index : -1);
    }
}
