class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int ml = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int r = 0;r<n;r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                l = Math.max(l,map.get(c)+1);
            }

            map.put(c,r);
            ml = Math.max(ml,r-l+1);
        }
        return ml;

         
    }
}