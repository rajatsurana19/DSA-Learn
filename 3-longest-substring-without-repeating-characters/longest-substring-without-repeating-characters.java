class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> ans = new HashMap<>();
        int max = 0;
        int start = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(ans.containsKey(c)){
                start = Math.max(start,ans.get(c)+1);
            }
            ans.put(c,i);
            max = Math.max(max,i-start+1);


        }    
        return max;  
    }
}