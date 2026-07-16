class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0){
            negative = true;
            x = -x;
        }
        int rem = 0;
        long rev = 0;
        while(x>0){
            rem = x%10;
            x/=10;
            rev = rev * 10 +rem;
        }

        if (negative) {
            rev = -rev;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}