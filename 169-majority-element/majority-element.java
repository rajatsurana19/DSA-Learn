class Solution {
    public int majorityElement(int[] nums) {
        int co = 0;
        int cand = 0;

        for(int i=0;i<nums.length;i++){
            if(co == 0){
                cand = nums[i];
            }
            if(nums[i] == cand){
                co++;
            }
            else{
                co--;
            }
        }
        return cand;
    }
}