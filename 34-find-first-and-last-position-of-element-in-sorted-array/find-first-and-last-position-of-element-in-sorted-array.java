class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min = -1, max = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (min == -1) {
                    min = i;
                }
                max = i;
            }
        }
        return new int[]{min, max};
    }
}