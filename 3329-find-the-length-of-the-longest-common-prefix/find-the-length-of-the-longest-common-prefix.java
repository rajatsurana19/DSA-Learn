class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();

        for (int num : arr1) {
            String s = String.valueOf(num);
            String prefix = "";
            for (int i = 0; i < s.length(); i++) {
                prefix += s.charAt(i);
                set.add(prefix);
            }
        }
        int ans = 0;
        for (int num : arr2) {
            String s = String.valueOf(num);
            String prefix = "";
            for (int i = 0; i < s.length(); i++) {
                prefix += s.charAt(i);
                if (set.contains(prefix)) {
                    ans = Math.max(ans, prefix.length());
                } else {
                    break;
                }
            }
        }

        return ans;
    }
}