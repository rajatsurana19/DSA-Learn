class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        boolean negative = false;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            negative = (s.charAt(i) == '-');
            i++;
        }

        long num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            if (!negative && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (negative && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return negative ? (int) -num : (int) num;
    }
}