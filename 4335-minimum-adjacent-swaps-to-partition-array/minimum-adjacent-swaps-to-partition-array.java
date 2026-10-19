class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long res = 0, c1 = 0, c2 = 0;
        for (int v : nums) {
            if (v < a) {
                res += c1 + c2;
            } else if (v <= b) {
                c1++;
                res += c2;
            } else {
                c2++;
            }
        }
        return (int) (res % 1000000007);
    }
}