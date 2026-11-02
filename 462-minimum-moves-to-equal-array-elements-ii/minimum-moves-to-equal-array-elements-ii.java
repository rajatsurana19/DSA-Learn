import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long min = nums[nums.length / 2];
        long res = 0;
        
        for (int n : nums) {
            int r = (int) Math.abs(n - min);
            res += r;
        }

        return (int) res;
    }
}