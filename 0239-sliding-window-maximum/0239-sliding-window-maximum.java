import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        int j = 0;

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove expired index
            while (!queue.isEmpty() && queue.getFirst() <= i - k) {
                queue.removeFirst();
            }

            // Remove smaller elements from back
            while (!queue.isEmpty() && nums[queue.getLast()] < nums[i]) {
                queue.removeLast();
            }

            // Add current index
            queue.addLast(i);

            // Store maximum
            if (i >= k - 1) {
                res[j++] = nums[queue.getFirst()];
            }
        }

        return res;
    }
}