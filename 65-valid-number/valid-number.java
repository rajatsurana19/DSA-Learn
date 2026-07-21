class Solution {
    public boolean isNumber(String s) {
        boolean numberS = false;
        boolean numberAE = true;
        boolean eS = false;
        boolean pointSeen = false;

        for(int i=0;i<s.length();i++){
            if('0'<= s.charAt(i) && s.charAt(i)<= '9'){
                numberS = true;
                numberAE = true;
            }
            else if(s.charAt(i) == '.'){
                if(eS || pointSeen ){
                    return false;
                }
                pointSeen = true;
            }
            else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                if(eS || !numberS){
                    return false;
                }
                numberAE = false;
                eS = true;
                
            }
            else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return numberS && numberAE;
    }
}