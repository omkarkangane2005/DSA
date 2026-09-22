class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = nums[0];
        int minEnding = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, -minSum);
    }
}