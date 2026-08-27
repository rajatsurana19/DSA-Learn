class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;
        int[] f = new int[256]; 
        for(high = 0; high<s.length();high++){
            f[s.charAt(high)]++;

            int mc = find(f);
            int len = high-low+1;
            int diff = len- mc;

            while(diff>k){
                f[s.charAt(low)]--;
                low++;

                mc = find(f);
                len = high-low+1;
                diff = len-mc;
            }

            res = Math.max(res,high-low+1);

             
        }
        return res;
    }

    int find(int[] a){
        int maC = -1;

        for(int i = 0; i<256;i++){
            maC = Math.max(maC,a[i]);
        }

        return maC;
    }
}