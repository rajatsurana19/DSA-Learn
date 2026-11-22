class Solution {
    public String reverseVowels(String s) {
        
        int i=0;
        int j = s.length()-1;
        char[] ch = s.toCharArray();

        while(j>i){

            if (!isVowel(ch[i])) {
                i++;
            }
            else if (!isVowel(ch[j])) {
                j--;
            }

            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }

       
    }
     return String.valueOf(ch);
    }

    public static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}