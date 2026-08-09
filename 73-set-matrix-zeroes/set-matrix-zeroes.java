class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] colum = new  boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    colum[j] = true;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || colum[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}