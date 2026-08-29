class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[] = new int[code.length];
        if(k>0){

           for(int i=0;i<code.length;i++){
            int sum = 0;
            int j = i+1;
            int m = 0;
                while(m<k){
                    if (j >= code.length) {
                        j = j % code.length;
                    }
                    sum+=code[j];
                    j++;
                    m++;
                }
                res[i] = sum;
            }

            return res;
        }
        if(k<0){
            k = -k;

            for(int i=0;i<code.length;i++){
                int sum = 0;
                int j = i-1;
                int m = 0;
                while(m<k){
                    if(j<0){
                        j =code.length-1;
                    }
                    sum+=code[j];
                    j--;

                    m++;
                }
                res[i] = sum;
            }

            return res;
                }
            
        
        if(k==0){
            for(int i=0;i<code.length;i++){
                code[i] = 0;
            }
            return code;
        }

        return code;
    }
}