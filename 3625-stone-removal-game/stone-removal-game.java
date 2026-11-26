class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        while (n >= a) {
            n -= a;
            a--;
            if (a == 0) break;
        }
        return a % 2 == 1;
    }
}