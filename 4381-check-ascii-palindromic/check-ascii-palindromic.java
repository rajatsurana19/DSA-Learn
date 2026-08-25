class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder bin = new StringBuilder();

        for( char c : s.toCharArray()){
            int x = c;

            for(int b = 7; b>=0;b--){
                bin.append((x>>b)&1);
            }


        }
        String str = bin.toString();
        String rev = bin.reverse().toString();

        return str.equals(rev);
    }
}