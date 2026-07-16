class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        StringBuilder st = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if( ch == '(' || ch == '{' || ch == '['){
                st.append(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                if (st.length() == 0) {
                return false;
                    }
                char top = st.charAt(st.length() - 1);
                if ((top == '(' && ch == ')') ||
                (top == '{' && ch == '}') ||
                (top == '[' && ch == ']')) {
                    st.deleteCharAt(st.length() - 1);
                }
                else{
                    return false;
                }
            }
        }
        return st.length() == 0;
    }
}