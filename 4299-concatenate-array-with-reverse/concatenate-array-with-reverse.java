class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length*2];
        
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[n+i] = nums[n-1-i];
        }
        return res;
    }
}