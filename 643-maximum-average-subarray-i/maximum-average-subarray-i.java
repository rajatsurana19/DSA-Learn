class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxs = sum;
        for(int r = k;r<nums.length;r++){
            sum += nums[r] - nums[r-k];
            maxs = Math.max(sum,maxs);
        }

        return maxs/k;
    }
}