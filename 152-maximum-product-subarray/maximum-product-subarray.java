
class Solution {
    public int maxProduct(int[] nums) {
        int mul = nums[0];
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = mul;
                mul = min;
                min = temp;
            }
            mul = Math.max(num, mul * num);
            min = Math.min(num, min * num);
            if (mul > max) {
                max = mul;
            }
        }
        return max;
    }
}
