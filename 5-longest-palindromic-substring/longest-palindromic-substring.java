class Solution {
        private int st = 0;
        private int l = 1;
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
             }
        for (int i = 0; i < s.length(); i++) {
            move(s, i, i);
            move(s, i, i + 1);
            }
        return s.substring(st,st+l);
        }
    public void move(String s, int left, int right) {
        while (left >= 0&&right < s.length() &&s.charAt(left) ==s.charAt(right)) {
            left--;
            right++;
        }
        int len = right - left - 1;
        if (len > l) {
            l = len;
            st = left + 1;
        }
    }
}