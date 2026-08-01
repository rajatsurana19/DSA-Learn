class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums,0,nums.length-1)>=0;
    }
    public int solve(int[] num,int i,int j){
        if(i==j){
            return num[i];
        }
        int pL = num[i]-solve(num,i+1,j);
        int pR = num[j] - solve(num,i,j-1);

        return Math.max(pL,pR);
    }
}