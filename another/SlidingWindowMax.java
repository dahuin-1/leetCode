package another;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] a = {2,1,3,4,6,3,8,9,10};
        SlidingWindowMax slidingWindowMax = new SlidingWindowMax();
        slidingWindowMax.maxSlidingWindow(a,4);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        final int[] max_left = new int[nums.length];
        final int[] max_right = new int[nums.length];

        max_left[0] = nums[0];
        max_right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            max_left[i] = (i % k == 0) ? nums[i] : Math.max(max_left[i - 1], nums[i]);

            final int j = nums.length - i - 1;
            max_right[j] = (j % k == 0) ? nums[j] : Math.max(max_right[j + 1], nums[j]);
        }

        final int[] sliding_max = new int[nums.length - k + 1];
        for (int i = 0, j = 0; i + k <= nums.length; i++) {
            sliding_max[j++] = Math.max(max_right[i], max_left[i + k - 1]);
        }

        return sliding_max;
    }
}
