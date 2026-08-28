class Solution {
    public String minWindow(String s, String t) {

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int l = 0;
        int r = 0;
        int req = t.length();
        int ml = Integer.MAX_VALUE;
        int start = 0;

        while (r < s.length()) {
        char c = s.charAt(r);
         if (need[c] > 0) {
           req--;
          }

         need[c]--;
         r++;

         while (req == 0) {

           if (r - l < ml) {
                    ml = r - l;
                    start = l;
              }
            char lC = s.charAt(l);
                need[lC]++;

                if (need[lC] > 0) {
                    req++;
                }

                l++;
            }
        }
        return ml == Integer.MAX_VALUE ? "" : s.substring(start, start + ml);
    }
}
