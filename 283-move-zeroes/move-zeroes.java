class Solution {
    public void moveZeroes(int[] nums) {
        int st = 0;
        for(int fa = 0;fa<nums.length;fa++){
            if(nums[fa]!=0){
                int temp = nums[fa];
                nums[fa] = nums[st];
                nums[st] = temp;
                st++;
            }
        }
    }
}