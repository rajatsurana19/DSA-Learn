class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min = strs[0].length();
        String ans = "";

        for (int i = 1; i < n; i++) {
            min = Math.min(min, strs[i].length());
        }

        for (int i = 0; i < min; i++) {
            for (int j = 1; j < n; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ans;
                }
            }
            ans += strs[0].charAt(i);
        }

        return ans;
    }
}