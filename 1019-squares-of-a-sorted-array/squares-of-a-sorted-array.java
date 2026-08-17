class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int l = 0;
        int r = nums.length-1;
        int res[] = new int[nums.length];
        int in = nums.length-1;

        while(l<=r){
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if(ls>rs){
                res[in] = ls;
                in--;
                l++;
            }
            else{
                res[in] = rs;
                in--;
                r--;
            }

        }
        return res;
    }
}