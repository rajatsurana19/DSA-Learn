class Solution {
    public int majorityElement(int[] nums) {
        int maxel = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == maxel){
                count++;
            }
            else if(count == 0){
                maxel = nums[i];
                count = 1;
            }
            else{
                count--;
            }
        }
        return maxel;
    }
}