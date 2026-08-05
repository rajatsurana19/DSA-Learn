class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> a = new HashSet<>();
        int res = 0;
        for(int n : nums){
            a.add(n);
        }
        int l = 0;
        for(int n : a){
            if(a.contains(n-1)){continue;}
            l = 1;
            while(a.contains(n+l)){
                l++;
            }
            res = Math.max(res,l);
        }
        
        return res;
    }
}