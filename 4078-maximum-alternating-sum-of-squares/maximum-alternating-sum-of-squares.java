class Solution {
    public long maxAlternatingSum(int[] nums) {
        long high =0;
        long low=0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length/2;i++){
            low += nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
            high += nums[i];
        }

        return high-low;
    }
}