class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();

        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);

            if(!ans.containsKey(k)){
                ans.put(k,new ArrayList<>());
            }
            ans.get(k).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}