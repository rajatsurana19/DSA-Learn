class Solution {
    public int arrangeCoins(int n) {
        int res = 1;
        while(n>0){
            res+=1;
            n-=res;
        }

        return res-1;
    }
}