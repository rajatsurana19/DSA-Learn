class Solution {
    public int reverseBits(int n) {

        StringBuilder st = new StringBuilder();
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int a = n & 1;
            st.append(a);
            n >>>= 1;
        }

        for (int i = 0; i < st.length(); i++) {
            int a = st.charAt(i) - '0';
            res = res * 2 + a;
        }

        return res;
    }
}