class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {

        int n = nums.length;

        // Prefix sum
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int ans = 0;

        // firstLen before secondLen
        int bestFirst = 0;

        for (int i = firstLen; i + secondLen <= n; i++) {

            // First subarray ends before current second subarray
            int firstSum = prefix[i] - prefix[i - firstLen];

            bestFirst = Math.max(bestFirst, firstSum);

            // Current second subarray
            int secondSum = prefix[i + secondLen] - prefix[i];

            ans = Math.max(ans, bestFirst + secondSum);
        }

        // secondLen before firstLen
        int bestSecond = 0;

        for (int i = secondLen; i + firstLen <= n; i++) {

            // Second subarray before current first subarray
            int secondSum = prefix[i] - prefix[i - secondLen];

            bestSecond = Math.max(bestSecond, secondSum);

            // Current first subarray
            int firstSum = prefix[i + firstLen] - prefix[i];

            ans = Math.max(ans, bestSecond + firstSum);
        }

        return ans;
    }
}