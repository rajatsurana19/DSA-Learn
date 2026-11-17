class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return res;
        }

        Map<Character, String> dL = new HashMap<>();
        dL.put('2', "abc");
        dL.put('3', "def");
        dL.put('4', "ghi");
        dL.put('5', "jkl");
        dL.put('6', "mno");
        dL.put('7', "pqrs");
        dL.put('8', "tuv");
        dL.put('9', "wxyz");

        bac(digits,0,new StringBuilder(),res,dL);

    return res;
    }

    public void bac(String d , int n, StringBuilder s,List<String> res, Map<Character,String>dL){
        if(n == d.length()){
            res.add(s.toString());
            return;
        }

        String l = dL.get(d.charAt(n));
        for(char le : l.toCharArray()){
            s.append(le);
            bac(d,n+1,s,res,dL);
            s.deleteCharAt(s.length()-1);
        }

    }

    

}