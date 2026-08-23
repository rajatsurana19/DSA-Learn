class Solution {
    public int reverse(int x) {
        boolean ne= false;
        if(x<0){
            x = -x;
            ne = true;
        }

        int rev = 0;
        while(x>0){
            int rem = x%10;
            x/=10;
             if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;

        }

        
        if(ne){
            rev = -rev;
        }

        return(int) rev;
    }
}