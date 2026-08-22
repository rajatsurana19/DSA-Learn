class Solution {
    public boolean checkDivisibility(int n) {
        int a = n;
        int sum = 0;
        int prd=1;
        
        while(a>0){
            int rem = a%10;
            sum+=rem;
            prd *= rem;
            a = a/10;
        }

        if(n %(sum+prd) == 0){
            return true;
        }
        return false;
    }
}