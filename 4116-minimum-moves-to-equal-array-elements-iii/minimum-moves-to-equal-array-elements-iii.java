class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<nums.length-1;i++){
            res += Math.abs(nums[i]-nums[nums.length-1]);
        }

        return res;
    }
}