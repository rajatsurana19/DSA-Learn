
class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;

        while (f != 1) {
            s = sq(s);
            f = sq(sq(f));

            if (s == f && s != 1) {
                return false;
            }
        }

        return true;
    }

    public int sq(int a) {
        int sum = 0;

        while (a > 0) {
            int d = a % 10;
            a = a / 10;
            sum += d * d;
        }

        return sum;
    }
}