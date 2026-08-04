class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];

        int sum = 0;
        for(int a : nums){
            sum+=a;
        }
        int count = 0;
        while(max>0){
            if(sum % k == 0){
                return count;
            }
            else{
                sum-=1;
                count++;
            }
        }
        return count;
    }
}