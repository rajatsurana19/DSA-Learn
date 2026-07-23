class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder o = new StringBuilder();


        StringBuilder a = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                o.append(Character.toLowerCase(c));
            }
        }
        for(int i=o.length()-1;i>=0;i--){
            a.append(o.charAt(i));
        }

        return o.toString().equals(a.toString());
    }
}