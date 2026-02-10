class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int posc = 0, negc = 0;

        for (int num : nums) {
            if (num > 0) {
                pos[posc++] = num;
            } else {
                neg[negc++] = num;
            }
        }

        int i = 0, p = 0, ne = 0;
        while (i < n) {
            nums[i++] = pos[p++];
            nums[i++] = neg[ne++];
        }

        return nums;
    }
}