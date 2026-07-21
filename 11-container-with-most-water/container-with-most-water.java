class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int start = 0;
        int count = 0;

        while(start<n){
            int w = n - start;
            int cA = Math.min(height[start],height[n])*w;
            count = Math.max(count,cA);
            if(height[start]<height[n]){
                start++;
            }
            else{n--;}
        }
        return count;
    }
}