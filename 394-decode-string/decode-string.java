class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != ']'){
                st.push(String.valueOf(ch));
            }
            else{
                 StringBuilder body = new StringBuilder();
                 while(!st.peek().equals("[")){
                    body.insert(0,st.pop());
                 }
                 st.pop();

                 StringBuilder num = new StringBuilder();

                 while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    num.insert(0,st.pop());
                 }

                 int k = Integer.parseInt(num.toString());

                 String rep = body.toString().repeat(k);
                 st.push(rep);
            }
        }
        StringBuilder res = new StringBuilder();

        for(String str : st){
            res.append(str);

        }
        return res.toString();
    }
}