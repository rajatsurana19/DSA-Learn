import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for (int digit : digits) {
            sb.append(digit);
        }

        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        String s = num.toString();

        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i) - '0';
        }

        return result;
    }
}