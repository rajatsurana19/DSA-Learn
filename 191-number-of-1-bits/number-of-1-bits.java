class Solution {
    public int hammingWeight(int n) {
        StringBuilder st = new StringBuilder();
        int count=0;

        while(n>0){
            int a = n%2;
            n/=2;
            st.append(String.valueOf(a));
        }

        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == '1'){
                count++;
            }
        }

        return count;
    }
}