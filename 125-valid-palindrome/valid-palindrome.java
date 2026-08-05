class Solution {
    public boolean isPalindrome(String s) {


        StringBuilder str = new StringBuilder();


        for(char a : s.toCharArray()){
            if(Character.isLetterOrDigit(a)){
                str.append(Character.toLowerCase(a));
            }
        }
                int l = 0;
        int r = str.length()-1;
        while(l<r){
            char ch = str.charAt(l);
            char ch2 = str.charAt(r);

            if(ch != ch2){return false;}
            l++;
            r--;
        }

        return true;
    }
}